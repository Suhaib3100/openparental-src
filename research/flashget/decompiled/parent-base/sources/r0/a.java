package r0;

import androidx.compose.runtime.internal.u;
import fg.l;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: WordBoundary.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lr0/a;", "", "Ljava/util/Locale;", "locale", "", "text", "<init>", "(Ljava/util/Locale;Ljava/lang/CharSequence;)V", "", "offset", "b", "(I)I", "a", "Lr0/b;", "Lr0/b;", "wordIterator", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final int f89557b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final b wordIterator;

    public a(@l Locale locale, @l CharSequence charSequence) {
        this.wordIterator = new b(charSequence, 0, charSequence.length(), locale);
    }

    public final int a(int offset) {
        int g4 = this.wordIterator.i(this.wordIterator.n(offset)) ? this.wordIterator.g(offset) : this.wordIterator.d(offset);
        return g4 == -1 ? offset : g4;
    }

    public final int b(int offset) {
        int f4 = this.wordIterator.k(this.wordIterator.o(offset)) ? this.wordIterator.f(offset) : this.wordIterator.e(offset);
        return f4 == -1 ? offset : f4;
    }
}
