package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.w;

/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes5.dex */
public enum a {
    NO_ARGUMENTS(false, false, 3, null),
    UNLESS_EMPTY(true, false, 2, null),
    ALWAYS_PARENTHESIZED(true, true);

    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;

    a(boolean z5, boolean z6) {
        this.includeAnnotationArguments = z5;
        this.includeEmptyAnnotationArguments = z6;
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.includeAnnotationArguments;
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.includeEmptyAnnotationArguments;
    }

    /* synthetic */ a(boolean z5, boolean z6, int i5, w wVar) {
        this((i5 & 1) != 0 ? false : z5, (i5 & 2) != 0 ? false : z6);
    }
}
