package com.tencent.liteav.videobase.frame;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.a;
import com.tencent.liteav.videobase.utils.ConsumerChainTimestamp;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.utils.ProducerChainTimestamp;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class e extends com.tencent.liteav.videobase.frame.a<d> {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f72258a = new AtomicInteger();

    public static class a extends d {

        /* renamed from: a, reason: collision with root package name */
        int f72259a;

        /* renamed from: b, reason: collision with root package name */
        final int f72260b;

        /* renamed from: c, reason: collision with root package name */
        final int f72261c;

        /* renamed from: d, reason: collision with root package name */
        private FrameMetaData f72262d;

        /* renamed from: e, reason: collision with root package name */
        private ProducerChainTimestamp f72263e;

        /* renamed from: f, reason: collision with root package name */
        private ConsumerChainTimestamp f72264f;

        /* synthetic */ a(g gVar, int i4, int i5, byte b5) {
            this(gVar, i4, i5);
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final int a() {
            return this.f72259a;
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final int b() {
            return this.f72260b;
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final int c() {
            return this.f72261c;
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final FrameMetaData d() {
            return this.f72262d;
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final void e() {
            this.f72262d = null;
            this.f72263e = null;
            this.f72264f = null;
        }

        @Override // com.tencent.liteav.videobase.frame.i
        public final void release() {
            super.release();
        }

        private a(g<d> gVar, int i4, int i5) {
            super(gVar);
            this.f72259a = -1;
            this.f72260b = i4;
            this.f72261c = i5;
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final PixelFrame a(Object obj) {
            b bVar = new b(this, obj, (byte) 0);
            bVar.retain();
            return bVar;
        }
    }

    public static class b extends PixelFrame {

        /* renamed from: b, reason: collision with root package name */
        private static final g<b> f72265b = f.a();

        /* renamed from: a, reason: collision with root package name */
        private final d f72266a;

        /* synthetic */ b(d dVar, Object obj, byte b5) {
            this(dVar, obj);
        }

        @Override // com.tencent.liteav.videobase.frame.PixelFrame
        public final void setTextureId(int i4) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("唦\u0001"));
        }

        private b(d dVar, Object obj) {
            super(f72265b);
            dVar.retain();
            this.mWidth = dVar.b();
            this.mHeight = dVar.c();
            this.f72266a = dVar;
            this.mTextureId = dVar.a();
            this.mGLContext = obj;
            this.mPixelBufferType = GLConstants.a.f72175b;
            this.mPixelFormatType = GLConstants.PixelFormatType.f72161f;
            this.mMetaData = dVar.d();
        }
    }

    static class c implements a.InterfaceC1003a {

        /* renamed from: a, reason: collision with root package name */
        final int f72267a;

        /* renamed from: b, reason: collision with root package name */
        final int f72268b;

        public c(int i4, int i5) {
            this.f72267a = i4;
            this.f72268b = i5;
        }

        public final boolean equals(Object obj) {
            if (obj.getClass() != c.class) {
                return false;
            }
            c cVar = (c) obj;
            return this.f72267a == cVar.f72267a && this.f72268b == cVar.f72268b;
        }

        public final int hashCode() {
            return (this.f72267a * 37213) + this.f72268b;
        }
    }

    @Override // com.tencent.liteav.videobase.frame.a
    protected final /* synthetic */ void a(d dVar) {
        a aVar = (a) dVar;
        OpenGlUtils.deleteTexture(aVar.f72259a);
        aVar.f72259a = -1;
        f72258a.getAndDecrement();
    }

    @Override // com.tencent.liteav.videobase.frame.a
    protected final /* synthetic */ a.InterfaceC1003a b(d dVar) {
        d dVar2 = dVar;
        return new c(dVar2.b(), dVar2.c());
    }

    @Override // com.tencent.liteav.videobase.frame.a
    public final void b() {
        super.b();
    }

    public final d a(int i4, int i5) {
        d a5 = a(new c(i4, i5));
        a5.e();
        return a5;
    }

    @Override // com.tencent.liteav.videobase.frame.a
    public final void a() {
        super.a();
    }

    @Override // com.tencent.liteav.videobase.frame.a
    protected final /* synthetic */ d a(g<d> gVar, a.InterfaceC1003a interfaceC1003a) {
        c cVar = (c) interfaceC1003a;
        a aVar = new a(gVar, cVar.f72267a, cVar.f72268b, (byte) 0);
        aVar.f72259a = OpenGlUtils.createTexture(aVar.f72260b, aVar.f72261c, 6408, 6408);
        f72258a.incrementAndGet();
        return aVar;
    }
}
