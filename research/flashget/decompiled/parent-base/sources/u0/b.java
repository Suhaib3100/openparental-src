package u0;

import androidx.compose.runtime.internal.u;
import fg.l;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.w;

/* compiled from: AndroidLocaleDelegate.android.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lu0/b;", "Lu0/h;", "<init>", "()V", "", "languageTag", "Lu0/g;", "a", "(Ljava/lang/String;)Lu0/g;", "Lu0/f;", "b", "()Lu0/f;", "current", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f92722a = 0;

    @Override // u0.h
    @l
    public g a(@l String languageTag) {
        return new a(Locale.forLanguageTag(languageTag));
    }

    @Override // u0.h
    @l
    public f b() {
        return new f((List<e>) w.k(new e(new a(Locale.getDefault()))));
    }
}
