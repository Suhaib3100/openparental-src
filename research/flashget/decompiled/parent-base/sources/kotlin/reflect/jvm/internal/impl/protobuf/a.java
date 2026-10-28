package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.o;

/* compiled from: AbstractMessageLite.java */
/* loaded from: classes7.dex */
public abstract class a implements o {

    /* renamed from: b, reason: collision with root package name */
    protected int f77666b = 0;

    UninitializedMessageException c() {
        return new UninitializedMessageException(this);
    }

    public void d(OutputStream outputStream) throws IOException {
        int t4 = t();
        int v4 = CodedOutputStream.v(t4) + t4;
        if (v4 > 4096) {
            v4 = 4096;
        }
        CodedOutputStream J = CodedOutputStream.J(outputStream, v4);
        J.o0(t4);
        b(J);
        J.I();
    }

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1167a<BuilderType extends AbstractC1167a> implements o.a {
        protected static UninitializedMessageException e(o oVar) {
            return new UninitializedMessageException(oVar);
        }

        @Override // 
        /* renamed from: c */
        public abstract BuilderType o();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: d */
        public abstract BuilderType r0(e eVar, f fVar) throws IOException;

        /* compiled from: AbstractMessageLite.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a$a, reason: collision with other inner class name */
        static final class C1168a extends FilterInputStream {

            /* renamed from: b, reason: collision with root package name */
            private int f77667b;

            C1168a(InputStream inputStream, int i4) {
                super(inputStream);
                this.f77667b = i4;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f77667b);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f77667b <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f77667b--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j4) throws IOException {
                long skip = super.skip(Math.min(j4, this.f77667b));
                if (skip >= 0) {
                    this.f77667b = (int) (this.f77667b - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i4, int i5) throws IOException {
                int i6 = this.f77667b;
                if (i6 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i4, Math.min(i5, i6));
                if (read >= 0) {
                    this.f77667b -= read;
                }
                return read;
            }
        }
    }
}
