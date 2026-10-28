package org.apache.log4j.or.sax;

import org.apache.log4j.or.ObjectRenderer;
import org.xml.sax.Attributes;

/* loaded from: classes3.dex */
public class AttributesRenderer implements ObjectRenderer {
    @Override // org.apache.log4j.or.ObjectRenderer
    public String doRender(Object obj) {
        if (!(obj instanceof Attributes)) {
            try {
                return obj.toString();
            } catch (Exception e4) {
                return e4.toString();
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        Attributes attributes = (Attributes) obj;
        int length = attributes.getLength();
        boolean z4 = true;
        for (int i4 = 0; i4 < length; i4++) {
            if (z4) {
                z4 = false;
            } else {
                stringBuffer.append(", ");
            }
            stringBuffer.append(attributes.getQName(i4));
            stringBuffer.append('=');
            stringBuffer.append(attributes.getValue(i4));
        }
        return stringBuffer.toString();
    }
}
