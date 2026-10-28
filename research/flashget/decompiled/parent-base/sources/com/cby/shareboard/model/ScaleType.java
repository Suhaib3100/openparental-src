package com.cby.shareboard.model;

import fg.l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* compiled from: ScaleType.kt */
@Retention(RetentionPolicy.RUNTIME)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0086\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/cby/shareboard/model/ScaleType;", "", "Companion", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public @interface ScaleType {
    public static final int CENTER_CROP = 2;
    public static final int CENTER_INSIDE = 3;

    /* renamed from: Companion, reason: from kotlin metadata */
    @l
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int FIT_BOTTOM = 7;
    public static final int FIT_CENTER = 0;
    public static final int FIT_END = 5;
    public static final int FIT_START = 4;
    public static final int FIT_TOP = 6;
    public static final int FIT_XY = 1;

    /* compiled from: ScaleType.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/cby/shareboard/model/ScaleType$Companion;", "", "()V", "CENTER_CROP", "", "CENTER_INSIDE", "FIT_BOTTOM", "FIT_CENTER", "FIT_END", "FIT_START", "FIT_TOP", "FIT_XY", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int CENTER_CROP = 2;
        public static final int CENTER_INSIDE = 3;
        public static final int FIT_BOTTOM = 7;
        public static final int FIT_CENTER = 0;
        public static final int FIT_END = 5;
        public static final int FIT_START = 4;
        public static final int FIT_TOP = 6;
        public static final int FIT_XY = 1;

        private Companion() {
        }
    }
}
