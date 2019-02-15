package me.seungwoo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import me.seungwoo.dto.ResponseData;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.util.StringUtils;

import java.io.IOException;

/**
 * Created by Leo.
 * User: ssw
 * Date: 2019-01-24
 * Time: 12:11
 */
public class ParserUtil {

    public static Object xmlToJsonParser(String xmlData) {
        JSONObject jsonObject = XML.toJSONObject(xmlData);
        JSONParser jsonParser = new JSONParser();
        Object json = null;
        try {
            json = jsonParser.parse(jsonObject.get("XML_SELECT").toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return json;
    }


    public static ResponseData xmlResultParser(String result) {
        ObjectMapper mapper = new ObjectMapper();
        ResponseData response = null;
        if (!StringUtils.isEmpty(result)) {
            JSONObject jsonObject = XML.toJSONObject(result);
            try {
                response = mapper.readValue(jsonObject.get("Result").toString(), new TypeReference<ExResponse>() {
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            response = new ResponseData();
        }
        return response;
    }

}
