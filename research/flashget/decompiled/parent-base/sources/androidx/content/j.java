package androidx.content;

import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: NamedNavArgument.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Landroidx/navigation/j;", "", "", "name", "Landroidx/navigation/q;", "argument", "<init>", "(Ljava/lang/String;Landroidx/navigation/q;)V", "a", "()Ljava/lang/String;", "b", "()Landroidx/navigation/q;", "Ljava/lang/String;", "d", "Landroidx/navigation/q;", "c", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final q argument;

    public j(@l String name, @l q argument) {
        l0.p(name, "name");
        l0.p(argument, "argument");
        this.name = name;
        this.argument = argument;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final q getArgument() {
        return this.argument;
    }

    @l
    public final q c() {
        return this.argument;
    }

    @l
    public final String d() {
        return this.name;
    }
}
