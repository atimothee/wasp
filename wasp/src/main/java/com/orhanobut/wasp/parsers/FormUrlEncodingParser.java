package com.orhanobut.wasp.parsers;

import com.squareup.okhttp.MediaType;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * Created by Timo on 5/8/15.
 */
public class FormUrlEncodingParser implements Parser{
    public static final String CONTENT_TYPE = "application/x-www-form-urlencoded";
    @Override
    public <T> T fromBody(String content, Type type) throws IOException {
        return null;
    }

    @Override
    public String toBody(Object body) {
        return null;
    }

    @Override
    public String getSupportedContentType() {
        return CONTENT_TYPE;
    }
}
