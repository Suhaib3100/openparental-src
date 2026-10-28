package org.eclipse.paho.client.mqttv3.internal.security;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;
import org.eclipse.paho.client.mqttv3.logging.Logger;

/* loaded from: classes5.dex */
public class SSLSocketFactoryFactory {
    private Hashtable configs;
    private Properties defaultProperties;
    private Logger logger;
    public static final String KEYSTOREMGR = "com.ibm.ssl.keyManager";
    public static final String TRUSTSTOREPROVIDER = "com.ibm.ssl.trustStoreProvider";
    public static final String SYSTRUSTMGRALGO = "ssl.TrustManagerFactory.algorithm";
    public static final String KEYSTOREPROVIDER = "com.ibm.ssl.keyStoreProvider";
    public static final String JSSEPROVIDER = "com.ibm.ssl.contextProvider";
    public static final String SYSKEYSTOREPWD = "javax.net.ssl.keyStorePassword";
    public static final String CIPHERSUITES = "com.ibm.ssl.enabledCipherSuites";
    private static final String CLASS_NAME = "org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory";
    public static final String CLIENTAUTH = "com.ibm.ssl.clientAuthentication";
    public static final String SYSTRUSTSTORETYPE = "javax.net.ssl.trustStoreType";
    public static final String SYSTRUSTSTORE = "javax.net.ssl.trustStore";
    public static final String TRUSTSTOREMGR = "com.ibm.ssl.trustManager";
    public static final String KEYSTORETYPE = "com.ibm.ssl.keyStoreType";
    private static final String xorTag = "{xor}";
    public static final String DEFAULT_PROTOCOL = "TLS";
    public static final String TRUSTSTOREPWD = "com.ibm.ssl.trustStorePassword";
    public static final String KEYSTOREPWD = "com.ibm.ssl.keyStorePassword";
    public static final String SSLPROTOCOL = "com.ibm.ssl.protocol";
    public static final String SYSKEYSTORE = "javax.net.ssl.keyStore";
    public static final String SYSTRUSTSTOREPWD = "javax.net.ssl.trustStorePassword";
    public static final String TRUSTSTORE = "com.ibm.ssl.trustStore";
    public static final String SYSKEYMGRALGO = "ssl.KeyManagerFactory.algorithm";
    public static final String SYSKEYSTORETYPE = "javax.net.ssl.keyStoreType";
    public static final String TRUSTSTORETYPE = "com.ibm.ssl.trustStoreType";
    public static final String KEYSTORE = "com.ibm.ssl.keyStore";
    private static final String[] propertyKeys = {"com.ibm.ssl.protocol", "com.ibm.ssl.contextProvider", "com.ibm.ssl.keyStore", "com.ibm.ssl.keyStorePassword", "com.ibm.ssl.keyStoreType", "com.ibm.ssl.keyStoreProvider", "com.ibm.ssl.keyManager", "com.ibm.ssl.trustStore", "com.ibm.ssl.trustStorePassword", "com.ibm.ssl.trustStoreType", "com.ibm.ssl.trustStoreProvider", "com.ibm.ssl.trustManager", "com.ibm.ssl.enabledCipherSuites", "com.ibm.ssl.clientAuthentication"};
    private static final byte[] key = {-99, -89, -39, Byte.MIN_VALUE, 5, -72, -119, -100};

    public SSLSocketFactoryFactory() {
        this.logger = null;
        this.configs = new Hashtable();
    }

    private void checkPropertyKeys(Properties properties) throws IllegalArgumentException {
        for (String str : properties.keySet()) {
            if (!keyValid(str)) {
                throw new IllegalArgumentException(String.valueOf(str).concat(" is not a valid IBM SSL property key."));
            }
        }
    }

    private void convertPassword(Properties properties) {
        String property = properties.getProperty("com.ibm.ssl.keyStorePassword");
        if (property != null && !property.startsWith("{xor}")) {
            properties.put("com.ibm.ssl.keyStorePassword", obfuscate(property.toCharArray()));
        }
        String property2 = properties.getProperty("com.ibm.ssl.trustStorePassword");
        if (property2 == null || property2.startsWith("{xor}")) {
            return;
        }
        properties.put("com.ibm.ssl.trustStorePassword", obfuscate(property2.toCharArray()));
    }

    public static char[] deObfuscate(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] decode = SimpleBase64Encoder.decode(str.substring(5));
            for (int i4 = 0; i4 < decode.length; i4++) {
                byte b5 = decode[i4];
                byte[] bArr = key;
                decode[i4] = (byte) ((b5 ^ bArr[i4 % bArr.length]) & 255);
            }
            return toChar(decode);
        } catch (Exception unused) {
            return null;
        }
    }

    private String getProperty(String str, String str2, String str3) {
        String propertyFromConfig = getPropertyFromConfig(str, str2);
        return propertyFromConfig != null ? propertyFromConfig : str3 != null ? System.getProperty(str3) : propertyFromConfig;
    }

    private String getPropertyFromConfig(String str, String str2) {
        String str3 = null;
        Properties properties = str != null ? (Properties) this.configs.get(str) : null;
        if (properties != null && (str3 = properties.getProperty(str2)) != null) {
            return str3;
        }
        Properties properties2 = this.defaultProperties;
        if (properties2 == null || (str3 = properties2.getProperty(str2)) != null) {
        }
        return str3;
    }

    private SSLContext getSSLContext(String str) throws MqttSecurityException {
        KeyManager[] keyManagerArr;
        TrustManager[] trustManagerArr;
        String sSLProtocol = getSSLProtocol(str);
        if (sSLProtocol == null) {
            sSLProtocol = "TLS";
        }
        Logger logger = this.logger;
        if (logger != null) {
            logger.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12000", new Object[]{str != null ? str : "null (broker defaults)", sSLProtocol});
        }
        String jSSEProvider = getJSSEProvider(str);
        try {
            SSLContext sSLContext = jSSEProvider == null ? SSLContext.getInstance(sSLProtocol) : SSLContext.getInstance(sSLProtocol, jSSEProvider);
            Logger logger2 = this.logger;
            if (logger2 != null) {
                logger2.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12001", new Object[]{str != null ? str : "null (broker defaults)", sSLContext.getProvider().getName()});
            }
            String property = getProperty(str, "com.ibm.ssl.keyStore", null);
            if (property == null) {
                property = getProperty(str, "com.ibm.ssl.keyStore", "javax.net.ssl.keyStore");
            }
            Logger logger3 = this.logger;
            if (logger3 != null) {
                logger3.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12004", new Object[]{str != null ? str : "null (broker defaults)", property != null ? property : "null"});
            }
            char[] keyStorePassword = getKeyStorePassword(str);
            Logger logger4 = this.logger;
            if (logger4 != null) {
                logger4.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12005", new Object[]{str != null ? str : "null (broker defaults)", keyStorePassword != null ? obfuscate(keyStorePassword) : "null"});
            }
            String keyStoreType = getKeyStoreType(str);
            if (keyStoreType == null) {
                keyStoreType = KeyStore.getDefaultType();
            }
            Logger logger5 = this.logger;
            if (logger5 != null) {
                logger5.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12006", new Object[]{str != null ? str : "null (broker defaults)", keyStoreType != null ? keyStoreType : "null"});
            }
            String defaultAlgorithm = KeyManagerFactory.getDefaultAlgorithm();
            String keyStoreProvider = getKeyStoreProvider(str);
            String keyManager = getKeyManager(str);
            if (keyManager != null) {
                defaultAlgorithm = keyManager;
            }
            if (property == null || keyStoreType == null || defaultAlgorithm == null) {
                keyManagerArr = null;
            } else {
                try {
                    KeyStore keyStore = KeyStore.getInstance(keyStoreType);
                    keyStore.load(new FileInputStream(property), keyStorePassword);
                    KeyManagerFactory keyManagerFactory = keyStoreProvider != null ? KeyManagerFactory.getInstance(defaultAlgorithm, keyStoreProvider) : KeyManagerFactory.getInstance(defaultAlgorithm);
                    Logger logger6 = this.logger;
                    if (logger6 != null) {
                        logger6.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12010", new Object[]{str != null ? str : "null (broker defaults)", defaultAlgorithm});
                        this.logger.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12009", new Object[]{str != null ? str : "null (broker defaults)", keyManagerFactory.getProvider().getName()});
                    }
                    keyManagerFactory.init(keyStore, keyStorePassword);
                    keyManagerArr = keyManagerFactory.getKeyManagers();
                } catch (FileNotFoundException e4) {
                    throw new MqttSecurityException(e4);
                } catch (IOException e5) {
                    throw new MqttSecurityException(e5);
                } catch (KeyStoreException e6) {
                    throw new MqttSecurityException(e6);
                } catch (UnrecoverableKeyException e7) {
                    throw new MqttSecurityException(e7);
                } catch (CertificateException e10) {
                    throw new MqttSecurityException(e10);
                }
            }
            String trustStore = getTrustStore(str);
            Logger logger7 = this.logger;
            if (logger7 != null) {
                logger7.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12011", new Object[]{str != null ? str : "null (broker defaults)", trustStore != null ? trustStore : "null"});
            }
            char[] trustStorePassword = getTrustStorePassword(str);
            Logger logger8 = this.logger;
            if (logger8 != null) {
                logger8.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12012", new Object[]{str != null ? str : "null (broker defaults)", trustStorePassword != null ? obfuscate(trustStorePassword) : "null"});
            }
            String trustStoreType = getTrustStoreType(str);
            if (trustStoreType == null) {
                trustStoreType = KeyStore.getDefaultType();
            }
            Logger logger9 = this.logger;
            if (logger9 != null) {
                logger9.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12013", new Object[]{str != null ? str : "null (broker defaults)", trustStoreType != null ? trustStoreType : "null"});
            }
            String defaultAlgorithm2 = TrustManagerFactory.getDefaultAlgorithm();
            String trustStoreProvider = getTrustStoreProvider(str);
            String trustManager = getTrustManager(str);
            if (trustManager != null) {
                defaultAlgorithm2 = trustManager;
            }
            if (trustStore == null || trustStoreType == null || defaultAlgorithm2 == null) {
                trustManagerArr = null;
            } else {
                try {
                    KeyStore keyStore2 = KeyStore.getInstance(trustStoreType);
                    keyStore2.load(new FileInputStream(trustStore), trustStorePassword);
                    TrustManagerFactory trustManagerFactory = trustStoreProvider != null ? TrustManagerFactory.getInstance(defaultAlgorithm2, trustStoreProvider) : TrustManagerFactory.getInstance(defaultAlgorithm2);
                    Logger logger10 = this.logger;
                    if (logger10 != null) {
                        logger10.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12017", new Object[]{str != null ? str : "null (broker defaults)", defaultAlgorithm2});
                        Logger logger11 = this.logger;
                        if (str == null) {
                            str = "null (broker defaults)";
                        }
                        logger11.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12016", new Object[]{str, trustManagerFactory.getProvider().getName()});
                    }
                    trustManagerFactory.init(keyStore2);
                    trustManagerArr = trustManagerFactory.getTrustManagers();
                } catch (FileNotFoundException e11) {
                    throw new MqttSecurityException(e11);
                } catch (IOException e12) {
                    throw new MqttSecurityException(e12);
                } catch (KeyStoreException e13) {
                    throw new MqttSecurityException(e13);
                } catch (CertificateException e14) {
                    throw new MqttSecurityException(e14);
                }
            }
            sSLContext.init(keyManagerArr, trustManagerArr, null);
            return sSLContext;
        } catch (KeyManagementException e15) {
            throw new MqttSecurityException(e15);
        } catch (NoSuchAlgorithmException e16) {
            throw new MqttSecurityException(e16);
        } catch (NoSuchProviderException e17) {
            throw new MqttSecurityException(e17);
        }
    }

    public static boolean isSupportedOnJVM() throws LinkageError, ExceptionInInitializerError {
        try {
            Class.forName("javax.net.ssl.SSLServerSocketFactory");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private boolean keyValid(String str) {
        String[] strArr;
        int i4 = 0;
        while (true) {
            strArr = propertyKeys;
            if (i4 < strArr.length && !strArr[i4].equals(str)) {
                i4++;
            }
        }
        return i4 < strArr.length;
    }

    public static String obfuscate(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        byte[] bArr = toByte(cArr);
        for (int i4 = 0; i4 < bArr.length; i4++) {
            byte b5 = bArr[i4];
            byte[] bArr2 = key;
            bArr[i4] = (byte) ((b5 ^ bArr2[i4 % bArr2.length]) & 255);
        }
        return "{xor}".concat(new String(SimpleBase64Encoder.encode(bArr)));
    }

    public static String packCipherSuites(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i4 = 0; i4 < strArr.length; i4++) {
            stringBuffer.append(strArr[i4]);
            if (i4 < strArr.length - 1) {
                stringBuffer.append(',');
            }
        }
        return stringBuffer.toString();
    }

    public static byte[] toByte(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        byte[] bArr = new byte[cArr.length * 2];
        int i4 = 0;
        int i5 = 0;
        while (i4 < cArr.length) {
            int i6 = i5 + 1;
            char c5 = cArr[i4];
            bArr[i5] = (byte) (c5 & 255);
            i5 += 2;
            i4++;
            bArr[i6] = (byte) ((c5 >> '\b') & 255);
        }
        return bArr;
    }

    public static char[] toChar(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] cArr = new char[bArr.length / 2];
        int i4 = 0;
        int i5 = 0;
        while (i4 < bArr.length) {
            int i6 = i4 + 1;
            int i7 = bArr[i4] & 255;
            i4 += 2;
            cArr[i5] = (char) (i7 + ((bArr[i6] & 255) << 8));
            i5++;
        }
        return cArr;
    }

    public static String[] unpackCipherSuites(String str) {
        if (str == null) {
            return null;
        }
        Vector vector = new Vector();
        int indexOf = str.indexOf(44);
        int i4 = 0;
        while (indexOf > -1) {
            vector.add(str.substring(i4, indexOf));
            i4 = indexOf + 1;
            indexOf = str.indexOf(44, i4);
        }
        vector.add(str.substring(i4));
        String[] strArr = new String[vector.size()];
        vector.toArray(strArr);
        return strArr;
    }

    public SSLSocketFactory createSocketFactory(String str) throws MqttSecurityException {
        SSLContext sSLContext = getSSLContext(str);
        Logger logger = this.logger;
        if (logger != null) {
            logger.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "createSocketFactory", "12020", new Object[]{str != null ? str : "null (broker defaults)", getEnabledCipherSuites(str) != null ? getProperty(str, "com.ibm.ssl.enabledCipherSuites", null) : "null (using platform-enabled cipher suites)"});
        }
        return sSLContext.getSocketFactory();
    }

    public boolean getClientAuthentication(String str) {
        String property = getProperty(str, "com.ibm.ssl.clientAuthentication", null);
        if (property != null) {
            return Boolean.valueOf(property).booleanValue();
        }
        return false;
    }

    public Properties getConfiguration(String str) {
        return (Properties) (str == null ? this.defaultProperties : this.configs.get(str));
    }

    public String[] getEnabledCipherSuites(String str) {
        return unpackCipherSuites(getProperty(str, "com.ibm.ssl.enabledCipherSuites", null));
    }

    public String getJSSEProvider(String str) {
        return getProperty(str, "com.ibm.ssl.contextProvider", null);
    }

    public String getKeyManager(String str) {
        return getProperty(str, "com.ibm.ssl.keyManager", "ssl.KeyManagerFactory.algorithm");
    }

    public String getKeyStore(String str) {
        String propertyFromConfig = getPropertyFromConfig(str, "com.ibm.ssl.keyStore");
        return propertyFromConfig != null ? propertyFromConfig : System.getProperty("javax.net.ssl.keyStore");
    }

    public char[] getKeyStorePassword(String str) {
        String property = getProperty(str, "com.ibm.ssl.keyStorePassword", "javax.net.ssl.keyStorePassword");
        if (property != null) {
            return property.startsWith("{xor}") ? deObfuscate(property) : property.toCharArray();
        }
        return null;
    }

    public String getKeyStoreProvider(String str) {
        return getProperty(str, "com.ibm.ssl.keyStoreProvider", null);
    }

    public String getKeyStoreType(String str) {
        return getProperty(str, "com.ibm.ssl.keyStoreType", "javax.net.ssl.keyStoreType");
    }

    public String getSSLProtocol(String str) {
        return getProperty(str, "com.ibm.ssl.protocol", null);
    }

    public String getTrustManager(String str) {
        return getProperty(str, "com.ibm.ssl.trustManager", "ssl.TrustManagerFactory.algorithm");
    }

    public String getTrustStore(String str) {
        return getProperty(str, "com.ibm.ssl.trustStore", "javax.net.ssl.trustStore");
    }

    public char[] getTrustStorePassword(String str) {
        String property = getProperty(str, "com.ibm.ssl.trustStorePassword", "javax.net.ssl.trustStorePassword");
        if (property != null) {
            return property.startsWith("{xor}") ? deObfuscate(property) : property.toCharArray();
        }
        return null;
    }

    public String getTrustStoreProvider(String str) {
        return getProperty(str, "com.ibm.ssl.trustStoreProvider", null);
    }

    public String getTrustStoreType(String str) {
        return getProperty(str, "com.ibm.ssl.trustStoreType", null);
    }

    public void initialize(Properties properties, String str) throws IllegalArgumentException {
        checkPropertyKeys(properties);
        Properties properties2 = new Properties();
        properties2.putAll(properties);
        convertPassword(properties2);
        if (str != null) {
            this.configs.put(str, properties2);
        } else {
            this.defaultProperties = properties2;
        }
    }

    public void merge(Properties properties, String str) throws IllegalArgumentException {
        checkPropertyKeys(properties);
        Properties properties2 = this.defaultProperties;
        if (str != null) {
            properties2 = (Properties) this.configs.get(str);
        }
        if (properties2 == null) {
            properties2 = new Properties();
        }
        convertPassword(properties);
        properties2.putAll(properties);
        if (str != null) {
            this.configs.put(str, properties2);
        } else {
            this.defaultProperties = properties2;
        }
    }

    public boolean remove(String str) {
        if (str != null) {
            if (this.configs.remove(str) != null) {
                return true;
            }
        } else if (this.defaultProperties != null) {
            this.defaultProperties = null;
            return true;
        }
        return false;
    }

    public SSLSocketFactoryFactory(Logger logger) {
        this();
        this.logger = logger;
    }
}
