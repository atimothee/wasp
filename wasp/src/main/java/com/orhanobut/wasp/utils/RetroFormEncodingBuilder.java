package com.orhanobut.wasp.utils;

/**
 * Most of this class is copied from retrofit
 */

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.RequestBody;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

final class RetroFormEncodingBuilder {
    private final Buffer content = new Buffer();

    RetroFormEncodingBuilder add(String name, String value) {
        if (content.size() > 0) {
            content.writeByte('&');
        }
        try {
                name = URLEncoder.encode(name, "UTF-8");
                value = URLEncoder.encode(value, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
        content.writeUtf8(name);
        content.writeByte('=');
        content.writeUtf8(value);
        return this;
    }

    String build() {
        if (content.size() == 0) {
            throw new IllegalStateException("Form encoded body must have at least one part.");
        }
        return content.readByteString().toString();
    }

   // private static final class FormEncodingRequestBody extends RequestBody {
////        private static final MediaType CONTENT_TYPE =
////                MediaType.parse("application/x-www-form-urlencoded");
//
//        private final ByteString snapshot;

//        public FormEncodingRequestBody(ByteString snapshot) {
//            this.snapshot = snapshot;
//        }
//
//        //@Override public MediaType contentType() {
//            return CONTENT_TYPE;
//        }

//        @Override public long contentLength() throws IOException {
//            return snapshot.size();
//        }
//
//        @Override public void writeTo(BufferedSink sink) throws IOException {
//            sink.write(snapshot);
//        }
    //}
}

