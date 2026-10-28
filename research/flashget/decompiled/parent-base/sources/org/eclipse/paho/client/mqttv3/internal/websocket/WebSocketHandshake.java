package org.eclipse.paho.client.mqttv3.internal.websocket;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes5.dex */
public class WebSocketHandshake {
    String host;
    InputStream input;
    OutputStream output;
    int port;
    String uri;
    private static final String LINE_SEPARATOR = ProtectedSandApp.s("\uefbd");
    private static final String ACCEPT_SALT = ProtectedSandApp.s("\uefc5");
    private static final String HTTP_HEADER_SEC_WEBSOCKET_PROTOCOL = ProtectedSandApp.s("\uefb0");
    private static final String HTTP_HEADER_UPGRADE_WEBSOCKET = ProtectedSandApp.s("\uefaf");
    private static final String SHA1_PROTOCOL = ProtectedSandApp.s("\uefc4");
    private static final String HTTP_HEADER_SEC_WEBSOCKET_ACCEPT = ProtectedSandApp.s("\uefb1");
    private static final String EMPTY = "";
    private static final String HTTP_HEADER_CONNECTION = ProtectedSandApp.s("\uefad");
    private static final String HTTP_HEADER_CONNECTION_VALUE = ProtectedSandApp.s("\uefae");
    private static final String HTTP_HEADER_UPGRADE = ProtectedSandApp.s("\uefae");

    public WebSocketHandshake(InputStream inputStream, OutputStream outputStream, String str, String str2, int i4) {
        this.input = inputStream;
        this.output = outputStream;
        this.uri = str;
        this.host = str2;
        this.port = i4;
    }

    private Map getHeaders(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        for (int i4 = 1; i4 < arrayList.size(); i4++) {
            String[] split = ((String) arrayList.get(i4)).split(ProtectedSandApp.s("\uefac"));
            hashMap.put(split[0].toLowerCase(), split[1]);
        }
        return hashMap;
    }

    private void receiveHandshakeResponse(String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.input));
        ArrayList arrayList = new ArrayList();
        String readLine = bufferedReader.readLine();
        if (readLine == null) {
            throw new IOException(ProtectedSandApp.s("\uefb7"));
        }
        while (!readLine.equals("")) {
            arrayList.add(readLine);
            readLine = bufferedReader.readLine();
        }
        Map headers = getHeaders(arrayList);
        String str2 = (String) headers.get(ProtectedSandApp.s("\uefad"));
        if (str2 != null) {
            String s4 = ProtectedSandApp.s("\uefae");
            if (!str2.equalsIgnoreCase(s4)) {
                String str3 = (String) headers.get(s4);
                if (str3 == null || !str3.toLowerCase().contains(ProtectedSandApp.s("\uefaf"))) {
                    throw new IOException(ProtectedSandApp.s("\uefb5"));
                }
                if (((String) headers.get(ProtectedSandApp.s("\uefb0"))) == null) {
                    throw new IOException(ProtectedSandApp.s("\uefb4"));
                }
                String s5 = ProtectedSandApp.s("\uefb1");
                if (!headers.containsKey(s5)) {
                    throw new IOException(ProtectedSandApp.s("\uefb3"));
                }
                try {
                    verifyWebSocketKey(str, (String) headers.get(s5));
                    return;
                } catch (NoSuchAlgorithmException e4) {
                    throw new IOException(e4.getMessage());
                } catch (HandshakeFailedException unused) {
                    throw new IOException(ProtectedSandApp.s("\uefb2"));
                }
            }
        }
        throw new IOException(ProtectedSandApp.s("\uefb6"));
    }

    private void sendHandshakeRequest(String str) throws IOException {
        String s4 = ProtectedSandApp.s("\uefb8");
        try {
            String s5 = ProtectedSandApp.s("\uefb9");
            URI uri = new URI(this.uri);
            if (uri.getRawPath() != null && !uri.getRawPath().isEmpty()) {
                s5 = uri.getRawPath();
                if (uri.getRawQuery() != null && !uri.getRawQuery().isEmpty()) {
                    s5 = String.valueOf(s5) + ProtectedSandApp.s("\uefba") + uri.getRawQuery();
                }
            }
            PrintWriter printWriter = new PrintWriter(this.output);
            printWriter.print(ProtectedSandApp.s("\uefbb") + s5 + s4);
            int i4 = this.port;
            String s6 = ProtectedSandApp.s("\uefbc");
            String s7 = ProtectedSandApp.s("\uefbd");
            if (i4 == 80 || i4 == 443) {
                printWriter.print(s6 + this.host + s7);
            } else {
                printWriter.print(s6 + this.host + ProtectedSandApp.s("\uefac") + this.port + s7);
            }
            printWriter.print(ProtectedSandApp.s("\uefbe"));
            printWriter.print(ProtectedSandApp.s("\uefbf"));
            printWriter.print(ProtectedSandApp.s("\uefc0") + str + s7);
            printWriter.print(ProtectedSandApp.s("\uefc1"));
            printWriter.print(ProtectedSandApp.s("\uefc2"));
            String userInfo = uri.getUserInfo();
            if (userInfo != null) {
                printWriter.print(ProtectedSandApp.s("\uefc3") + Base64.encode(userInfo) + s7);
            }
            printWriter.print(s7);
            printWriter.flush();
        } catch (URISyntaxException e4) {
            throw new IllegalStateException(e4.getMessage());
        }
    }

    private byte[] sha1(String str) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(ProtectedSandApp.s("\uefc4")).digest(str.getBytes());
    }

    private void verifyWebSocketKey(String str, String str2) throws NoSuchAlgorithmException, HandshakeFailedException {
        if (!Base64.encodeBytes(sha1(String.valueOf(str).concat(ProtectedSandApp.s("\uefc5")))).trim().equals(str2.trim())) {
            throw new HandshakeFailedException();
        }
    }

    public void execute() throws IOException {
        byte[] bArr = new byte[16];
        System.arraycopy(UUID.randomUUID().toString().getBytes(), 0, bArr, 0, 16);
        String encodeBytes = Base64.encodeBytes(bArr);
        sendHandshakeRequest(encodeBytes);
        receiveHandshakeResponse(encodeBytes);
    }
}
