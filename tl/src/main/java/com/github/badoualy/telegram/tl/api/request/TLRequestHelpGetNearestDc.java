package com.github.badoualy.telegram.tl.api.request;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLNearestDc;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLObject;

import java.io.IOException;
import java.io.InputStream;

import static com.github.badoualy.telegram.tl.StreamUtils.readTLObject;

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public class TLRequestHelpGetNearestDc extends TLMethod<TLNearestDc> {
    public static final int CLASS_ID = 0x1fb33026;

    public TLRequestHelpGetNearestDc() {
    }

    @Override
    @SuppressWarnings("unchecked")
    public TLNearestDc deserializeResponse(InputStream stream, TLContext context) throws IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLNearestDc)) {
            throw new IOException("Incorrect response type, expected getClass().getCanonicalName(), found response.getClass().getCanonicalName()");
        }
        return (TLNearestDc) response;
    }

    @Override
    public String toString() {
        return "help.getNearestDc#1fb33026";
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }
}