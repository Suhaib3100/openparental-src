package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.o;

/* compiled from: AbstractMessageLite.java */
/* loaded from: classes6.dex */
public abstract class a implements o {

    /* renamed from: o, reason: collision with root package name */
    protected int f25684o = 0;

    UninitializedMessageException b() {
        return new UninitializedMessageException(this);
    }

    public void c(OutputStream outputStream) throws IOException {
        int u5 = u();
        int v5 = CodedOutputStream.v(u5) + u5;
        if (v5 > 4096) {
            v5 = 4096;
        }
        CodedOutputStream J = CodedOutputStream.J(outputStream, v5);
        J.o0(u5);
        a(J);
        J.I();
    }

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0362a<BuilderType extends AbstractC0362a> implements o.a {
        protected static UninitializedMessageException d(o oVar) {
            return new UninitializedMessageException(oVar);
        }

        @Override // 
        /* renamed from: b */
        public abstract BuilderType q();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        public abstract BuilderType c(e eVar, f fVar) throws IOException;

        /* compiled from: AbstractMessageLite.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0363a extends FilterInputStream {

            /* renamed from: o, reason: collision with root package name */
            private int f25685o;

            C0363a(InputStream inputStream, int i5) {
                super(inputStream);
                this.f25685o = i5;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f25685o);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f25685o <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f25685o--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j5) throws IOException {
                long skip = super.skip(Math.min(j5, this.f25685o));
                if (skip >= 0) {
                    this.f25685o = (int) (this.f25685o - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i5, int i6) throws IOException {
                int i7 = this.f25685o;
                if (i7 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i5, Math.min(i6, i7));
                if (read >= 0) {
                    this.f25685o -= read;
                }
                return read;
            }
        }
    }
}
