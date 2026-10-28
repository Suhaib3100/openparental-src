package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.annotation.d0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;

/* compiled from: ToolbarUtils.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes6.dex */
public class o {
    private o() {
    }

    @q0
    public static ActionMenuItemView a(@o0 Toolbar toolbar, @d0 int i4) {
        ActionMenuView b5 = b(toolbar);
        if (b5 == null) {
            return null;
        }
        for (int i5 = 0; i5 < b5.getChildCount(); i5++) {
            View childAt = b5.getChildAt(i5);
            if (childAt instanceof ActionMenuItemView) {
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) childAt;
                if (actionMenuItemView.g().getItemId() == i4) {
                    return actionMenuItemView;
                }
            }
        }
        return null;
    }

    @q0
    public static ActionMenuView b(@o0 Toolbar toolbar) {
        for (int i4 = 0; i4 < toolbar.getChildCount(); i4++) {
            View childAt = toolbar.getChildAt(i4);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    @q0
    public static ImageButton c(@o0 Toolbar toolbar) {
        Drawable N = toolbar.N();
        if (N == null) {
            return null;
        }
        for (int i4 = 0; i4 < toolbar.getChildCount(); i4++) {
            View childAt = toolbar.getChildAt(i4);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == N) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    @q0
    public static View d(@o0 Toolbar toolbar) {
        ActionMenuView b5 = b(toolbar);
        if (b5 == null || b5.getChildCount() <= 1) {
            return null;
        }
        return b5.getChildAt(0);
    }

    @q0
    public static TextView e(@o0 Toolbar toolbar) {
        return f(toolbar, toolbar.S());
    }

    @q0
    private static TextView f(@o0 Toolbar toolbar, CharSequence charSequence) {
        for (int i4 = 0; i4 < toolbar.getChildCount(); i4++) {
            View childAt = toolbar.getChildAt(i4);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }

    @q0
    public static TextView g(@o0 Toolbar toolbar) {
        return f(toolbar, toolbar.U());
    }
}
