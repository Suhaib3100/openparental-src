package kotlin.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ReadWrite.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/io/p;", "Lkotlin/sequences/m;", "", "Ljava/io/BufferedReader;", "reader", "<init>", "(Ljava/io/BufferedReader;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "Ljava/io/BufferedReader;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class p implements kotlin.sequences.m<String> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final BufferedReader reader;

    /* compiled from: ReadWrite.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0016\u0010\f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"kotlin/io/p$a", "", "", "", "hasNext", "()Z", "b", "()Ljava/lang/String;", "Ljava/lang/String;", "nextValue", "c", "Z", "done", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<String>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private String nextValue;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean done;

        a() {
        }

        @Override // java.util.Iterator
        @fg.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.nextValue;
            this.nextValue = null;
            l0.m(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextValue == null && !this.done) {
                String readLine = p.this.reader.readLine();
                this.nextValue = readLine;
                if (readLine == null) {
                    this.done = true;
                }
            }
            return this.nextValue != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("搯\u0001"));
        }
    }

    public p(@fg.l BufferedReader bufferedReader) {
        l0.p(bufferedReader, ProtectedSandApp.s("搰\u0001"));
        this.reader = bufferedReader;
    }

    @Override // kotlin.sequences.m
    @fg.l
    public Iterator<String> iterator() {
        return new a();
    }
}
