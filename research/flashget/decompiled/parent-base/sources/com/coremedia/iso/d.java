package com.coremedia.iso;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.util.m;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;

/* compiled from: BoxReplacer.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f47635a = false;

    public static void a(Map<String, com.coremedia.iso.boxes.b> map, File file) throws IOException {
        f fVar = new f(new com.googlecode.mp4parser.c(new RandomAccessFile(file, ProtectedSandApp.s("ᒪ")).getChannel()));
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, com.coremedia.iso.boxes.b> entry : map.entrySet()) {
            com.coremedia.iso.boxes.b d5 = m.d(fVar, entry.getKey());
            hashMap.put(m.a(d5), entry.getValue());
            hashMap2.put(m.a(d5), Long.valueOf(d5.getOffset()));
        }
        fVar.close();
        FileChannel channel = new RandomAccessFile(file, ProtectedSandApp.s("ᒫ")).getChannel();
        for (String str : hashMap.keySet()) {
            com.coremedia.iso.boxes.b bVar = (com.coremedia.iso.boxes.b) hashMap.get(str);
            channel.position(((Long) hashMap2.get(str)).longValue());
            bVar.getBox(channel);
        }
        channel.close();
    }
}
