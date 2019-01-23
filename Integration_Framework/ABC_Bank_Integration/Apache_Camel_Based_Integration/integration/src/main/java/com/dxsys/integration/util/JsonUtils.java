package com.dxsys.integration.util;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

/**
 * This class provides utility methods for Converting from POJO to JSON and vice-versa
 *
 * @author Infosys
 * @version 1.0
 * @since 2015-05-09
 */
public final class JsonUtils
{
    private static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * @param object Object to be converted to JSON
     * @return String Converted JSON string
     */
    public static String convertToJson(Object object) throws Exception {
        String result = null;

        if (object == null)
        {
            return null;
        }
        try
        {
            result = objectMapper.writeValueAsString(object);
            return result;
        } catch (Exception e)
        {
            throw new Exception("Exception occurred while converting POJO to JSON", e);
        }

    }

    /**
     * @param json          JSON to be converted to POJO
     * @param typeReference Type of Object to which JSON to be converted
     * @param <T>
     * @return <T> Converted Customer object
     */
    public static <T> T convertToPojo(String json, TypeReference<T> typeReference) throws Exception

    {
        Object result = null;

        try
        {
            result = objectMapper.readValue(json, typeReference);
            return (T) result;
        } catch (Exception e)
        {
            throw new Exception("Exception occurred while converting JSON to POJO", e);
        }

    }
}