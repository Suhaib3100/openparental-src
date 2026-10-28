package u0;

import android.os.LocaleList;
import androidx.annotation.x0;
import androidx.compose.runtime.internal.u;
import androidx.compose.ui.text.platform.z;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: AndroidLocaleDelegate.android.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0014¨\u0006\u0016"}, d2 = {"Lu0/c;", "Lu0/h;", "<init>", "()V", "", "languageTag", "Lu0/g;", "a", "(Ljava/lang/String;)Lu0/g;", "Landroid/os/LocaleList;", "Landroid/os/LocaleList;", "lastPlatformLocaleList", "Lu0/f;", "b", "Lu0/f;", "lastLocaleList", "Landroidx/compose/ui/text/platform/z;", "c", "Landroidx/compose/ui/text/platform/z;", "lock", "()Lu0/f;", "current", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(api = 24)
/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final int f92723d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @m
    private LocaleList lastPlatformLocaleList;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private f lastLocaleList;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final z lock = new z();

    @Override // u0.h
    @l
    public g a(@l String languageTag) {
        return new a(Locale.forLanguageTag(languageTag));
    }

    @Override // u0.h
    @l
    public f b() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.lock) {
            f fVar = this.lastLocaleList;
            if (fVar != null && localeList == this.lastPlatformLocaleList) {
                return fVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(new e(new a(localeList.get(i4))));
            }
            f fVar2 = new f(arrayList);
            this.lastPlatformLocaleList = localeList;
            this.lastLocaleList = fVar2;
            return fVar2;
        }
    }
}
