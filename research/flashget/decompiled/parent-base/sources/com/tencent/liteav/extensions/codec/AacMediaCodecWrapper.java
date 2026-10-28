package com.tencent.liteav.extensions.codec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class AacMediaCodecWrapper {

    /* renamed from: a, reason: collision with root package name */
    MediaFormat f71962a;

    /* renamed from: b, reason: collision with root package name */
    int f71963b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final String f71964c;

    /* renamed from: d, reason: collision with root package name */
    private final int f71965d;

    /* renamed from: e, reason: collision with root package name */
    private MediaCodec f71966e;

    /* renamed from: f, reason: collision with root package name */
    private final MediaCodec.BufferInfo f71967f;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f71968a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f71969b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ int[] f71970c = {1, 2};
    }

    public AacMediaCodecWrapper(int i4) {
        this.f71965d = i4;
        this.f71964c = i4 == a.f71968a ? ProtectedSandApp.s("叒\u0001") : ProtectedSandApp.s("叓\u0001");
        this.f71967f = new MediaCodec.BufferInfo();
    }

    private ByteBuffer b() {
        try {
            int dequeueOutputBuffer = this.f71966e.dequeueOutputBuffer(this.f71967f, TimeUnit.MILLISECONDS.toMicros(5L));
            if (dequeueOutputBuffer == -1) {
                return null;
            }
            if (dequeueOutputBuffer == -3) {
                Log.i(this.f71964c, ProtectedSandApp.s("叔\u0001"), new Object[0]);
                return null;
            }
            if (dequeueOutputBuffer == -2) {
                this.f71962a = this.f71966e.getOutputFormat();
                Log.i(this.f71964c, ProtectedSandApp.s("叕\u0001") + this.f71962a, new Object[0]);
                return null;
            }
            if (dequeueOutputBuffer < 0) {
                Log.e(this.f71964c, ProtectedSandApp.s("取\u0001").concat(String.valueOf(dequeueOutputBuffer)), new Object[0]);
                return null;
            }
            ByteBuffer outputBuffer = LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? this.f71966e.getOutputBuffer(dequeueOutputBuffer) : this.f71966e.getOutputBuffers()[dequeueOutputBuffer];
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f71967f.size);
            allocateDirect.put(outputBuffer);
            this.f71966e.releaseOutputBuffer(dequeueOutputBuffer, false);
            int i4 = this.f71963b;
            if (i4 > 0) {
                this.f71963b = i4 - 1;
            }
            return allocateDirect;
        } catch (Exception e4) {
            Log.e(this.f71964c, ProtectedSandApp.s("受\u0001").concat(String.valueOf(e4)), new Object[0]);
            return null;
        }
    }

    public final boolean a(MediaFormat mediaFormat) {
        if (this.f71966e == null && mediaFormat != null) {
            try {
                int i4 = this.f71965d == a.f71968a ? 1 : 0;
                String s4 = ProtectedSandApp.s("叚\u0001");
                if (i4 != 0) {
                    this.f71966e = MediaCodec.createEncoderByType(s4);
                } else {
                    this.f71966e = MediaCodec.createDecoderByType(s4);
                }
                this.f71966e.configure(mediaFormat, (Surface) null, (MediaCrypto) null, i4);
                this.f71966e.start();
                return true;
            } catch (IOException e4) {
                Log.e(this.f71964c, ProtectedSandApp.s("叛\u0001").concat(String.valueOf(e4)), new Object[0]);
                a();
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006c -> B:14:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.nio.ByteBuffer processFrame(java.nio.ByteBuffer r14) {
        /*
            r13 = this;
            android.media.MediaCodec r0 = r13.f71966e
            r1 = 0
            if (r0 == 0) goto L6f
            if (r14 != 0) goto L8
            goto L6f
        L8:
            r2 = 0
            java.nio.ByteBuffer[] r0 = r0.getInputBuffers()     // Catch: java.lang.Exception -> L3d
            if (r0 == 0) goto L3f
            int r3 = r0.length     // Catch: java.lang.Exception -> L3d
            if (r3 > 0) goto L13
            goto L3f
        L13:
            android.media.MediaCodec r3 = r13.f71966e     // Catch: java.lang.Exception -> L3d
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L3d
            r5 = 5
            long r4 = r4.toMicros(r5)     // Catch: java.lang.Exception -> L3d
            int r7 = r3.dequeueInputBuffer(r4)     // Catch: java.lang.Exception -> L3d
            if (r7 >= 0) goto L24
            goto L62
        L24:
            int r9 = r14.remaining()     // Catch: java.lang.Exception -> L3d
            r0 = r0[r7]     // Catch: java.lang.Exception -> L3d
            r0.put(r14)     // Catch: java.lang.Exception -> L3d
            android.media.MediaCodec r6 = r13.f71966e     // Catch: java.lang.Exception -> L3d
            r10 = 0
            r12 = 0
            r8 = 0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch: java.lang.Exception -> L3d
            int r14 = r13.f71963b     // Catch: java.lang.Exception -> L3d
            int r14 = r14 + 1
            r13.f71963b = r14     // Catch: java.lang.Exception -> L3d
            goto L62
        L3d:
            r14 = move-exception
            goto L4d
        L3f:
            java.lang.String r14 = r13.f71964c     // Catch: java.lang.Exception -> L3d
            java.lang.String r0 = "叜\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: java.lang.Exception -> L3d
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L3d
            com.tencent.liteav.base.Log.e(r14, r0, r3)     // Catch: java.lang.Exception -> L3d
            goto L62
        L4d:
            java.lang.String r0 = r13.f71964c
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r3 = "叝\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            java.lang.String r14 = r3.concat(r14)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.liteav.base.Log.e(r0, r14, r3)
        L62:
            r14 = 3
            if (r2 >= r14) goto L6f
            java.nio.ByteBuffer r14 = r13.b()
            if (r14 == 0) goto L6c
            return r14
        L6c:
            int r2 = r2 + 1
            goto L62
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.extensions.codec.AacMediaCodecWrapper.processFrame(java.nio.ByteBuffer):java.nio.ByteBuffer");
    }

    public final void a() {
        MediaCodec mediaCodec = this.f71966e;
        if (mediaCodec == null) {
            return;
        }
        try {
            mediaCodec.stop();
        } catch (Exception e4) {
            Log.e(this.f71964c, ProtectedSandApp.s("变\u0001").concat(String.valueOf(e4)), new Object[0]);
        }
        try {
            this.f71966e.release();
        } catch (Exception e5) {
            Log.e(this.f71964c, ProtectedSandApp.s("叙\u0001").concat(String.valueOf(e5)), new Object[0]);
        }
        this.f71966e = null;
        this.f71963b = 0;
    }
}
