package com.applandeo.materialcalendarview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* compiled from: CalendarUtils.java */
/* loaded from: classes3.dex */
public final class b {
    private b() {
    }

    private static ArrayList<Calendar> a(Date date, Date date2) {
        ArrayList<Calendar> arrayList = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        long days = TimeUnit.MILLISECONDS.toDays(calendar2.getTimeInMillis() - calendar.getTimeInMillis());
        for (int i4 = 1; i4 < days; i4++) {
            Calendar calendar3 = (Calendar) calendar.clone();
            arrayList.add(calendar3);
            calendar3.add(5, i4);
        }
        return arrayList;
    }

    public static ArrayList<Calendar> b(Calendar calendar, Calendar calendar2) {
        return calendar2.before(calendar) ? a(calendar2.getTime(), calendar.getTime()) : a(calendar.getTime(), calendar2.getTime());
    }

    public static Drawable c(Context context, String str, Typeface typeface, int i4, int i5) {
        Resources resources = context.getResources();
        Bitmap createBitmap = Bitmap.createBitmap(48, 48, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        if (typeface == null) {
            typeface = Typeface.create(Typeface.DEFAULT, 1);
        }
        paint.setTypeface(typeface);
        paint.setColor(androidx.core.content.d.getColor(context, i4));
        paint.setTextSize((int) (i5 * resources.getDisplayMetrics().density));
        paint.getTextBounds(str, 0, str.length(), new Rect());
        canvas.drawText(str, (createBitmap.getWidth() - r7.width()) / 2, (r7.height() + createBitmap.getHeight()) / 2, paint);
        return new BitmapDrawable(context.getResources(), createBitmap);
    }
}
