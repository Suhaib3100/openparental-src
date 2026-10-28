package androidx.constraintlayout.motion.widget;

/* compiled from: DesignTool.java */
/* loaded from: classes.dex */
interface v {
    long a();

    int b(int cmd, String type, Object viewObject, float[] in, int inLength, float[] out, int outLength);

    Boolean c(Object keyFrame, Object view, float x4, float y4, String[] attribute, float[] value);

    boolean d(Object view, int position, int type, float x4, float y4);

    void e(float position);

    void f(Object view, int position, String name, Object value);

    void g(int dpi, String constraintSetId, Object opaqueView, Object opaqueAttributes);

    float h(Object view, int type, float x4, float y4);

    Object i(Object viewObject, float x4, float y4);
}
