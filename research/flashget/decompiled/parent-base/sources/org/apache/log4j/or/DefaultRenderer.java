package org.apache.log4j.or;

/* loaded from: classes3.dex */
class DefaultRenderer implements ObjectRenderer {
    DefaultRenderer() {
    }

    @Override // org.apache.log4j.or.ObjectRenderer
    public String doRender(Object obj) {
        try {
            return obj.toString();
        } catch (Exception e4) {
            return e4.toString();
        }
    }
}
