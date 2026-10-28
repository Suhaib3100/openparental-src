package com.github.mikephil.charting.utils;

import android.content.res.AssetManager;
import android.os.Environment;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FileUtils.java */
/* loaded from: classes5.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f50630a = ProtectedSandApp.s("쑟");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0050 -> B:12:0x005f). Please report as a decompilation issue!!! */
    public static List<BarEntry> a(AssetManager assetManager, String str) {
        BufferedReader bufferedReader;
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader2 = null;
        float f4 = 0;
        BufferedReader bufferedReader3 = null;
        bufferedReader2 = null;
        try {
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(assetManager.open(str), ProtectedSandApp.s("쑝")));
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e4) {
                e = e4;
            }
        } catch (IOException e5) {
            e5.toString();
            bufferedReader2 = bufferedReader2;
        }
        try {
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                String[] split = readLine.split(ProtectedSandApp.s("쑞"));
                f4 = Float.parseFloat(split[1]);
                arrayList.add(new BarEntry(f4, Float.parseFloat(split[0])));
            }
            bufferedReader.close();
            bufferedReader2 = f4;
        } catch (IOException e6) {
            e = e6;
            bufferedReader3 = bufferedReader;
            e.toString();
            bufferedReader2 = bufferedReader3;
            if (bufferedReader3 != null) {
                bufferedReader3.close();
                bufferedReader2 = bufferedReader3;
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException e7) {
                    e7.toString();
                }
            }
            throw th;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [float[]] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14, types: [float] */
    public static List<Entry> b(AssetManager assetManager, String str) {
        BufferedReader bufferedReader;
        ?? r12;
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader2 = null;
        BufferedReader bufferedReader3 = null;
        bufferedReader2 = null;
        bufferedReader2 = null;
        try {
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(assetManager.open(str), ProtectedSandApp.s("쑝")));
                } catch (IOException e4) {
                    e4.toString();
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            String readLine = bufferedReader.readLine();
            while (readLine != null) {
                String[] split = readLine.split(ProtectedSandApp.s("쑞"));
                if (split.length <= 2) {
                    r12 = Float.parseFloat(split[1]);
                    arrayList.add(new Entry(r12, Float.parseFloat(split[0])));
                } else {
                    int length = split.length - 1;
                    r12 = new float[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        r12[i4] = Float.parseFloat(split[i4]);
                    }
                    arrayList.add(new BarEntry(Integer.parseInt(split[split.length - 1]), (float[]) r12));
                }
                readLine = bufferedReader.readLine();
                bufferedReader3 = r12;
            }
            bufferedReader.close();
            bufferedReader2 = bufferedReader3;
        } catch (IOException e6) {
            e = e6;
            bufferedReader2 = bufferedReader;
            e.toString();
            if (bufferedReader2 != null) {
                bufferedReader2.close();
                bufferedReader2 = bufferedReader2;
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException e7) {
                    e7.toString();
                }
            }
            throw th;
        }
        return arrayList;
    }

    public static List<Entry> c(String str) {
        File file = new File(Environment.getExternalStorageDirectory(), str);
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(ProtectedSandApp.s("쑞"));
                if (split.length <= 2) {
                    arrayList.add(new Entry(Float.parseFloat(split[0]), Integer.parseInt(split[1])));
                } else {
                    int length = split.length - 1;
                    float[] fArr = new float[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        fArr[i4] = Float.parseFloat(split[i4]);
                    }
                    arrayList.add(new BarEntry(Integer.parseInt(split[split.length - 1]), fArr));
                }
            }
        } catch (IOException e4) {
            e4.toString();
        }
        return arrayList;
    }

    public static void d(List<Entry> list, String str) {
        File file = new File(Environment.getExternalStorageDirectory(), str);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e4) {
                e4.toString();
            }
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            for (Entry entry : list) {
                bufferedWriter.append((CharSequence) (entry.c() + ProtectedSandApp.s("쑞") + entry.j()));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e5) {
            e5.toString();
        }
    }
}
