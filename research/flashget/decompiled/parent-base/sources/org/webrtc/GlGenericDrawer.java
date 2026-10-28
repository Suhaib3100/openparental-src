package org.webrtc;

import android.opengl.GLES20;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.webrtc.RendererCommon;

/* loaded from: classes9.dex */
class GlGenericDrawer implements RendererCommon.GlDrawer {

    @androidx.annotation.q0
    private GlShader currentShader;

    @androidx.annotation.q0
    private ShaderType currentShaderType;
    private final String genericFragmentSource;
    private int inPosLocation;
    private int inTcLocation;
    private final ShaderCallbacks shaderCallbacks;
    private int texMatrixLocation;
    private final String vertexShader;
    private static final String DEFAULT_VERTEX_SHADER_STRING = ProtectedSandApp.s("ꐦ\u0001");
    private static final String INPUT_VERTEX_COORDINATE_NAME = ProtectedSandApp.s("ꐧ\u0001");
    private static final String TEXTURE_MATRIX_NAME = ProtectedSandApp.s("ꐨ\u0001");
    private static final String INPUT_TEXTURE_COORDINATE_NAME = ProtectedSandApp.s("ꐩ\u0001");
    private static final FloatBuffer FULL_RECTANGLE_BUFFER = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer FULL_RECTANGLE_TEXTURE_BUFFER = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});

    public interface ShaderCallbacks {
        void onNewShader(GlShader glShader);

        void onPrepareShader(GlShader glShader, float[] fArr, int i4, int i5, int i6, int i7);
    }

    public enum ShaderType {
        OES,
        RGB,
        YUV
    }

    public GlGenericDrawer(String str, ShaderCallbacks shaderCallbacks) {
        this(ProtectedSandApp.s("ꐦ\u0001"), str, shaderCallbacks);
    }

    static String createFragmentShaderString(String str, ShaderType shaderType) {
        StringBuilder sb = new StringBuilder();
        ShaderType shaderType2 = ShaderType.OES;
        if (shaderType == shaderType2) {
            sb.append(ProtectedSandApp.s("ꐪ\u0001"));
        }
        sb.append(ProtectedSandApp.s("ꐫ\u0001"));
        if (shaderType == ShaderType.YUV) {
            sb.append(ProtectedSandApp.s("ꐬ\u0001"));
            sb.append(str);
        } else {
            androidx.concurrent.futures.a.a(sb, ProtectedSandApp.s("ꐯ\u0001"), shaderType == shaderType2 ? ProtectedSandApp.s("ꐭ\u0001") : ProtectedSandApp.s("ꐮ\u0001"), ProtectedSandApp.s("ꐰ\u0001"));
            sb.append(str.replace(ProtectedSandApp.s("ꐱ\u0001"), ProtectedSandApp.s("ꐲ\u0001")));
        }
        return sb.toString();
    }

    private void prepareShader(ShaderType shaderType, float[] fArr, int i4, int i5, int i6, int i7) {
        GlShader glShader;
        if (shaderType.equals(this.currentShaderType)) {
            glShader = this.currentShader;
        } else {
            this.currentShaderType = null;
            GlShader glShader2 = this.currentShader;
            if (glShader2 != null) {
                glShader2.release();
                this.currentShader = null;
            }
            GlShader createShader = createShader(shaderType);
            this.currentShaderType = shaderType;
            this.currentShader = createShader;
            createShader.useProgram();
            if (shaderType == ShaderType.YUV) {
                GLES20.glUniform1i(createShader.getUniformLocation(ProtectedSandApp.s("ꐳ\u0001")), 0);
                GLES20.glUniform1i(createShader.getUniformLocation(ProtectedSandApp.s("ꐴ\u0001")), 1);
                GLES20.glUniform1i(createShader.getUniformLocation(ProtectedSandApp.s("ꐵ\u0001")), 2);
            } else {
                GLES20.glUniform1i(createShader.getUniformLocation(ProtectedSandApp.s("ꐶ\u0001")), 0);
            }
            GlUtil.checkNoGLES2Error(ProtectedSandApp.s("ꐷ\u0001"));
            this.shaderCallbacks.onNewShader(createShader);
            this.texMatrixLocation = createShader.getUniformLocation(ProtectedSandApp.s("ꐨ\u0001"));
            this.inPosLocation = createShader.getAttribLocation(ProtectedSandApp.s("ꐧ\u0001"));
            this.inTcLocation = createShader.getAttribLocation(ProtectedSandApp.s("ꐩ\u0001"));
            glShader = createShader;
        }
        glShader.useProgram();
        GLES20.glEnableVertexAttribArray(this.inPosLocation);
        GLES20.glVertexAttribPointer(this.inPosLocation, 2, 5126, false, 0, (Buffer) FULL_RECTANGLE_BUFFER);
        GLES20.glEnableVertexAttribArray(this.inTcLocation);
        GLES20.glVertexAttribPointer(this.inTcLocation, 2, 5126, false, 0, (Buffer) FULL_RECTANGLE_TEXTURE_BUFFER);
        GLES20.glUniformMatrix4fv(this.texMatrixLocation, 1, false, fArr, 0);
        this.shaderCallbacks.onPrepareShader(glShader, fArr, i4, i5, i6, i7);
        GlUtil.checkNoGLES2Error(ProtectedSandApp.s("ꐸ\u0001"));
    }

    GlShader createShader(ShaderType shaderType) {
        return new GlShader(this.vertexShader, createFragmentShaderString(this.genericFragmentSource, shaderType));
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void drawOes(int i4, float[] fArr, int i5, int i6, int i7, int i10, int i11, int i12) {
        prepareShader(ShaderType.OES, fArr, i5, i6, i11, i12);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i4);
        GLES20.glViewport(i7, i10, i11, i12);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(36197, 0);
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void drawRgb(int i4, float[] fArr, int i5, int i6, int i7, int i10, int i11, int i12) {
        prepareShader(ShaderType.RGB, fArr, i5, i6, i11, i12);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i4);
        GLES20.glViewport(i7, i10, i11, i12);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void drawYuv(int[] iArr, float[] fArr, int i4, int i5, int i6, int i7, int i10, int i11) {
        prepareShader(ShaderType.YUV, fArr, i4, i5, i10, i11);
        for (int i12 = 0; i12 < 3; i12++) {
            GLES20.glActiveTexture(33984 + i12);
            GLES20.glBindTexture(3553, iArr[i12]);
        }
        GLES20.glViewport(i6, i7, i10, i11);
        GLES20.glDrawArrays(5, 0, 4);
        for (int i13 = 0; i13 < 3; i13++) {
            GLES20.glActiveTexture(i13 + 33984);
            GLES20.glBindTexture(3553, 0);
        }
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void release() {
        GlShader glShader = this.currentShader;
        if (glShader != null) {
            glShader.release();
            this.currentShader = null;
            this.currentShaderType = null;
        }
    }

    public GlGenericDrawer(String str, String str2, ShaderCallbacks shaderCallbacks) {
        this.vertexShader = str;
        this.genericFragmentSource = str2;
        this.shaderCallbacks = shaderCallbacks;
    }
}
