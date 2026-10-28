package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.c1;
import androidx.annotation.q0;

/* compiled from: AccessibilityViewCommand.java */
/* loaded from: classes3.dex */
public interface o0 {

    /* compiled from: AccessibilityViewCommand.java */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        Bundle f27060a;

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void a(@q0 Bundle bundle) {
            this.f27060a = bundle;
        }
    }

    /* compiled from: AccessibilityViewCommand.java */
    public static final class b extends a {
        public boolean b() {
            return this.f27060a.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        }

        public int c() {
            return this.f27060a.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        }
    }

    /* compiled from: AccessibilityViewCommand.java */
    public static final class c extends a {
        @q0
        public String b() {
            return this.f27060a.getString("ACTION_ARGUMENT_HTML_ELEMENT_STRING");
        }
    }

    /* compiled from: AccessibilityViewCommand.java */
    public static final class d extends a {
        public int b() {
            return this.f27060a.getInt("ACTION_ARGUMENT_MOVE_WINDOW_X");
        }

        public int c() {
            return this.f27060a.getInt("ACTION_ARGUMENT_MOVE_WINDOW_Y");
        }
    }

    /* compiled from: AccessibilityViewCommand.java */
    public static final class e extends a {
        public int b() {
            return this.f27060a.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT");
        }

        public int c() {
            return this.f27060a.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT");
        }
    }

    /* compiled from: AccessibilityViewCommand.java */
    public static final class f extends a {
        public float b() {
            return this.f27060a.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
        }
    }

    /* compiled from: AccessibilityViewCommand.java */
    public static final class g extends a {
        public int b() {
            return this.f27060a.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
        }

        public int c() {
            return this.f27060a.getInt("ACTION_ARGUMENT_SELECTION_START_INT");
        }
    }

    /* compiled from: AccessibilityViewCommand.java */
    public static final class h extends a {
        @q0
        public CharSequence b() {
            return this.f27060a.getCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        }
    }

    boolean a(@androidx.annotation.o0 View view, @q0 a aVar);
}
