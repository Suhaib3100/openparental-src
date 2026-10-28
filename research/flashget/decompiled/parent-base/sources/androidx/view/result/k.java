package androidx.view.result;

import b.b;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: PickVisualMediaRequest.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/activity/result/k;", "", "<init>", "()V", "Lb/b$j$f;", "<set-?>", "a", "Lb/b$j$f;", "()Lb/b$j$f;", "b", "(Lb/b$j$f;)V", "mediaType", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private b.j.f mediaType = b.j.C0653b.f36632a;

    /* compiled from: PickVisualMediaRequest.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/activity/result/k$a;", "", "<init>", "()V", "Lb/b$j$f;", "mediaType", "b", "(Lb/b$j$f;)Landroidx/activity/result/k$a;", "Landroidx/activity/result/k;", "a", "()Landroidx/activity/result/k;", "Lb/b$j$f;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private b.j.f mediaType = b.j.C0653b.f36632a;

        @l
        public final k a() {
            k kVar = new k();
            kVar.b(this.mediaType);
            return kVar;
        }

        @l
        public final a b(@l b.j.f mediaType) {
            l0.p(mediaType, "mediaType");
            this.mediaType = mediaType;
            return this;
        }
    }

    @l
    /* renamed from: a, reason: from getter */
    public final b.j.f getMediaType() {
        return this.mediaType;
    }

    public final void b(@l b.j.f fVar) {
        l0.p(fVar, "<set-?>");
        this.mediaType = fVar;
    }
}
