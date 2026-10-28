package kotlin.io;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.sequences.Sequence;

/* compiled from: ReadWrite.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0096\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/io/LinesSequence;", "Lkotlin/sequences/Sequence;", "", "reader", "Ljava/io/BufferedReader;", "(Ljava/io/BufferedReader;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.io.p, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class LinesSequence implements Sequence<String> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final BufferedReader f23430a;

    /* compiled from: ReadWrite.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0006\u001a\u00020\u0004H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"kotlin/io/LinesSequence$iterator$1", "", "", "done", "", "nextValue", "hasNext", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.io.p$a */
    public static final class a implements Iterator<String>, r3.a {

        /* renamed from: o, reason: collision with root package name */
        @d5.e
        private String f23431o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f23432p;

        a() {
        }

        @Override // java.util.Iterator
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f23431o;
            this.f23431o = null;
            l0.m(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f23431o == null && !this.f23432p) {
                String readLine = LinesSequence.this.f23430a.readLine();
                this.f23431o = readLine;
                if (readLine == null) {
                    this.f23432p = true;
                }
            }
            return this.f23431o != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("䁉"));
        }
    }

    public LinesSequence(@d5.d BufferedReader bufferedReader) {
        l0.p(bufferedReader, ProtectedSandApp.s("䁊"));
        this.f23430a = bufferedReader;
    }

    @Override // kotlin.sequences.Sequence
    @d5.d
    public Iterator<String> iterator() {
        return new a();
    }
}
