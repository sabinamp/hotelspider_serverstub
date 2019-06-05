package io.swagger.util;

import java.io.File;
import java.util.TreeMap;
import java.util.function.Function;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import io.swagger.model.AvailabilityResults;
import io.swagger.model.HotelDescriptiveInfo;

@Component
public class ModelObjectsManager {
	
	private static final ObjectMapper objectMapper;
	
	private TreeMap<String, HotelDescriptiveInfo> hotelDescriptiveInfos;
	private TreeMap<String, AvailabilityResults> hotelAvailabilityResults = new TreeMap<>();
	
	static {
		objectMapper = new ObjectMapper();
		objectMapper.registerModule(new JavaTimeModule());
	}
	
	@PostConstruct
    public void postConstruct() {
		// Read all hotel descriptive infos and adds them to a map-the key= hotel_id
		hotelDescriptiveInfos = readObjects("HotelDescriptiveInfos", HotelDescriptiveInfo.class, HotelDescriptiveInfo::getHotelId);
		
		// For each hotel found, read in the availability results.
		for (String hotelId : hotelDescriptiveInfos.keySet()) {
			AvailabilityResults availabilityResults = readObject("AvailabilityResults", hotelId, AvailabilityResults.class);
			hotelAvailabilityResults.put(hotelId, availabilityResults);
		}
    }
	
	public TreeMap<String, HotelDescriptiveInfo> getHotelDescriptiveInfos() {
		return hotelDescriptiveInfos;
	}

	public AvailabilityResults getAvailabilityResults(String hotelId) {
		return hotelAvailabilityResults.get(hotelId);
	}
	
	public static <K, T> TreeMap<K, T> readObjects(String folderName, Class<T> clazz, Function<T, K> keyExtractor) {
		try {
			return readObjectsImpl(folderName, clazz, keyExtractor);
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static <K, T> TreeMap<K, T> readObjectsImpl(String folderName, Class<T> clazz, Function<T, K> keyExtractor) throws Exception {
		File folder = ResourceUtils.getFile("classpath:" + folderName);
		File[] files = folder.listFiles();
		
		TreeMap<K, T> objectsMap = new TreeMap<>();

		for (File file : files) {
			T object = objectMapper.readValue(file, clazz);
			objectsMap.put(keyExtractor.apply(object), object);
			
		}
		
		return objectsMap;
	}
	
	public static <T> T readObject(String folderName, String objectId, Class<T> clazz) {
		try {
			return readObjectImpl(folderName, objectId, clazz);
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	//read from JSON
	private static <T> T readObjectImpl(String folderName, String objectId, Class<T> clazz) throws Exception {
		File file = ResourceUtils.getFile("classpath:" + folderName + "/" + objectId + ".json");
		return objectMapper.readValue(file, clazz);
	}
	
	
	public String getHotelName(String hotelId) {
		return getHotelDescriptiveInfos().get(hotelId).getHotelName();
		
	}
//	public static <T> ArrayList<T>  readObjectArray(String folderName, String objectId, Class<T> clazz) {
//		try {
//			return readObjectArrayImpl(folderName, objectId, clazz);
//		}
//		catch(Exception e) {
//			throw new RuntimeException(e);
//		}
//	}
//	
//	private static <T> ArrayList<T> readObjectArrayImpl(String folderName, String objectId, Class<T> clazz) throws Exception {
//		File file = ResourceUtils.getFile("classpath:" + folderName + "/" + objectId + ".json");
//		return objectMapper.readValue(file, new TypeReference<ArrayList<T>>() {});
//		
////		Class<T[]> arrayClass = (Class<T[]>) Class.forName("[L" + clazz.getName() + ";");
////		com.fasterxml.jackson.core.type.TypeReference<T>
//	}
	
}
