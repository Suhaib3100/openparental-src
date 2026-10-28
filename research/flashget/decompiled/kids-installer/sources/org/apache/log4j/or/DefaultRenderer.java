package org.apache.log4j.or;

/* loaded from: classes6.dex */
class DefaultRenderer implements ObjectRenderer {
    DefaultRenderer() {
    }

    @Override // org.apache.log4j.or.ObjectRenderer
    public String doRender(Object obj) {
        try {
            return obj.toString();
        } catch (Exception e6) {
            return e6.toString();
        }
    }
}
