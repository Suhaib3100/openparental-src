package androidx.compose.ui.platform;

import kotlin.Metadata;

/* compiled from: InspectableValue.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/a2;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "name", "b", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "e", "(Ljava/lang/Object;)V", "value", "Landroidx/compose/ui/platform/n5;", "Landroidx/compose/ui/platform/n5;", "()Landroidx/compose/ui/platform/n5;", "properties", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f19766d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Object value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n5 properties = new n5();

    @fg.m
    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final n5 getProperties() {
        return this.properties;
    }

    @fg.m
    /* renamed from: c, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    public final void d(@fg.m String str) {
        this.name = str;
    }

    public final void e(@fg.m Object obj) {
        this.value = obj;
    }
}
