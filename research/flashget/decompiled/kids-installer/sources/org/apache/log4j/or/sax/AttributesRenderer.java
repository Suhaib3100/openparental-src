package org.apache.log4j.or.sax;

import org.apache.log4j.or.ObjectRenderer;
import org.xml.sax.Attributes;

/* loaded from: classes6.dex */
public class AttributesRenderer implements ObjectRenderer {
    @Override // org.apache.log4j.or.ObjectRenderer
    public String doRender(Object obj) {
        if (!(obj instanceof Attributes)) {
            try {
                return obj.toString();
            } catch (Exception e6) {
                return e6.toString();
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        Attributes attributes = (Attributes) obj;
        int length = attributes.getLength();
        boolean z5 = true;
        for (int i5 = 0; i5 < length; i5++) {
            if (z5) {
                z5 = false;
            } else {
                stringBuffer.append(", ");
            }
            stringBuffer.append(attributes.getQName(i5));
            stringBuffer.append('=');
            stringBuffer.append(attributes.getValue(i5));
        }
        return stringBuffer.toString();
    }
}
