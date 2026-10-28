package com.tencent.qcloud.track.utils;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.track.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class EventFileUtils {
    public static void appendEventToFile(Context context, String str, Map<String, String> map) {
        OutputStreamWriter outputStreamWriter;
        Throwable th;
        String s4 = ProtectedSandApp.s("宊\u0001");
        if (context == null) {
            return;
        }
        File file = new File(context.getExternalCacheDir() + File.separator + Constants.BEACON_EVENT_CACHE_FILE_NAME);
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            if (!file.exists()) {
                try {
                    if (!file.createNewFile()) {
                        return;
                    }
                } catch (IOException unused) {
                    return;
                }
            }
            if (file.length() / 1048576 > 10) {
                return;
            }
            OutputStreamWriter outputStreamWriter2 = null;
            try {
                try {
                    outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file, true));
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append(ProtectedSandApp.s("宋\u0001"));
                        sb.append(str);
                        sb.append(s4);
                        sb.append(ProtectedSandApp.s("完\u0001"));
                        sb.append(s4);
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            sb.append(entry.getKey());
                            sb.append(ProtectedSandApp.s("宍\u0001"));
                            sb.append(entry.getValue());
                            sb.append(s4);
                        }
                        sb.append(s4);
                        outputStreamWriter.write(sb.toString());
                        outputStreamWriter.flush();
                        outputStreamWriter.close();
                    } catch (IOException unused2) {
                        outputStreamWriter2 = outputStreamWriter;
                        if (outputStreamWriter2 != null) {
                            outputStreamWriter2.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (outputStreamWriter == null) {
                            throw th;
                        }
                        try {
                            outputStreamWriter.close();
                            throw th;
                        } catch (IOException unused3) {
                            throw th;
                        }
                    }
                } catch (IOException unused4) {
                }
            } catch (IOException unused5) {
            } catch (Throwable th3) {
                outputStreamWriter = null;
                th = th3;
            }
        }
    }

    public static boolean eventFileExists(Context context) {
        if (context == null) {
            return false;
        }
        return new File(context.getExternalCacheDir() + File.separator + Constants.BEACON_EVENT_CACHE_FILE_NAME).exists();
    }

    public static void readEventFromFile(Context context, List<String> list, List<Map<String, String>> list2) {
        BufferedReader bufferedReader;
        Throwable th;
        String s4 = ProtectedSandApp.s("宍\u0001");
        if (context == null) {
            return;
        }
        File file = new File(context.getExternalCacheDir() + File.separator + Constants.BEACON_EVENT_CACHE_FILE_NAME);
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                HashMap hashMap = new HashMap();
                String str = "";
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.startsWith(ProtectedSandApp.s("宋\u0001"))) {
                        if (!str.isEmpty()) {
                            list.add(str);
                            list2.add(hashMap);
                            hashMap = new HashMap();
                        }
                        str = readLine.substring(12);
                    } else if (readLine.contains(s4)) {
                        String[] split = readLine.split(s4, 2);
                        hashMap.put(split[0], split[1]);
                    }
                }
                if (!str.isEmpty()) {
                    list.add(str);
                    list2.add(hashMap);
                }
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                if (!file.exists()) {
                    return;
                }
            } catch (IOException unused2) {
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused3) {
                    }
                }
                if (!file.exists()) {
                    return;
                }
                file.delete();
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                if (!file.exists()) {
                    throw th;
                }
                file.delete();
                throw th;
            }
        } catch (IOException unused5) {
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
        file.delete();
    }
}
