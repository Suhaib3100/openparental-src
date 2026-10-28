package org.webrtc;

import org.webrtc.GlGenericDrawer;

/* loaded from: classes9.dex */
public class GlRectDrawer extends GlGenericDrawer {
    private static final String FRAGMENT_SHADER = "void main() {\n  gl_FragColor = sample(tc);\n}\n";

    private static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i4, int i5, int i6, int i7) {
        }

        private ShaderCallbacks() {
        }
    }

    public GlRectDrawer() {
        super("void main() {\n  gl_FragColor = sample(tc);\n}\n", new ShaderCallbacks());
    }

    @Override // org.webrtc.GlGenericDrawer, org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawOes(int i4, float[] fArr, int i5, int i6, int i7, int i10, int i11, int i12) {
        super.drawOes(i4, fArr, i5, i6, i7, i10, i11, i12);
    }

    @Override // org.webrtc.GlGenericDrawer, org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawRgb(int i4, float[] fArr, int i5, int i6, int i7, int i10, int i11, int i12) {
        super.drawRgb(i4, fArr, i5, i6, i7, i10, i11, i12);
    }

    @Override // org.webrtc.GlGenericDrawer, org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawYuv(int[] iArr, float[] fArr, int i4, int i5, int i6, int i7, int i10, int i11) {
        super.drawYuv(iArr, fArr, i4, i5, i6, i7, i10, i11);
    }

    @Override // org.webrtc.GlGenericDrawer, org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}
