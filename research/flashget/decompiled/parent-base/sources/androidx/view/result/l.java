package androidx.view.result;

import androidx.view.result.k;
import b.b;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: PickVisualMediaRequest.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lb/b$j$f;", "mediaType", "Landroidx/activity/result/k;", "a", "(Lb/b$j$f;)Landroidx/activity/result/k;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l {
    @fg.l
    public static final k a(@fg.l b.j.f mediaType) {
        l0.p(mediaType, "mediaType");
        return new k.a().b(mediaType).a();
    }

    public static /* synthetic */ k b(b.j.f fVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fVar = b.j.C0653b.f36632a;
        }
        return a(fVar);
    }
}
