import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("================= DECIMAL IPS =================");

        String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String regex = "^" + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "$";
        String[] ips = new String[10];

        ips[0] = "177.204.237.247";
        ips[1] = "205.264.92.125"; // not valid
        ips[2] = "29.192.220.120";
        ips[3] = "16.203.39.255";
        ips[4] = "20.7.256.167"; // not valid
        ips[5] = "1.34.161.167";
        ips[6] = "1.168.111.69";
        ips[7] = "17.2282.213.63"; // not valid
        ips[8] = "80.232.65.220";
        ips[9] = "221.80.250.91";

        // create a pattern
        Pattern pattern = Pattern.compile(regex);

        // get a matcher object

        for (String ip: ips) {
            Matcher matcher = pattern.matcher(ip);
            if (matcher.find())
                System.out.println(matcher.group() + " is valid");
            else
                System.out.println(ip + " not valid");
        }

        System.out.println("========== HEXADECIMAL IPS =============");

        String zeroTo255hex = "(\\d{1,2}|\\d[a-f]|[a-f]\\d|[a-f]{1,2})";
        String regexHex = "^" + zeroTo255hex + "\\." + zeroTo255hex + "\\." + zeroTo255hex + "\\." + zeroTo255hex + "$";
        String[] ipsHex = new String[10];

        ipsHex[0] = "21.47.02.45";
        ipsHex[1] = "7f.100.e6.ee"; // not valid
        ipsHex[2] = "0f.5e.e5.58";
        ipsHex[3] = "08.8b.a9.fff"; // not valid
        ipsHex[4] = "1c.7c.9a.53";
        ipsHex[5] = "bf.cb.81.e6";
        ipsHex[6] = "abc.a2.3f.cc"; // not valid
        ipsHex[7] = "1d.7f.d2.32";
        ipsHex[8] = "a7.2f.cb.4a";
        ipsHex[9] = "cb.d3.eb.94";

        // create a pattern
        Pattern patternHex = Pattern.compile(regexHex);

        // get a matcher object

        for (String ipHex: ipsHex) {
            Matcher matcher = patternHex.matcher(ipHex);
            if (matcher.find())
                System.out.println(matcher.group() + " is valid");
            else
                System.out.println(ipHex + " not valid");
        }

        System.out.println("========== OCTAL IPS =============");

        String zeroTo255Octal = "([0-7]{1,2}|[0-3][0-7]{2})";
        String regexOctal = "^" + zeroTo255Octal + "\\." + zeroTo255Octal + "\\." + zeroTo255Octal + "\\." + zeroTo255Octal + "$";
        String[] ipsOctal = new String[10];

        ipsOctal[0] = "027.313.375.203";
        ipsOctal[1] = "143.157.022.263";
        ipsOctal[2] = "224.340.303.400"; // not valid
        ipsOctal[3] = "025.354.213.341";
        ipsOctal[4] = "166.145.230.114";
        ipsOctal[5] = "312.220.211.063";
        ipsOctal[6] = "107.203.026.274";
        ipsOctal[7] = "355.324.136.555"; // not valid
        ipsOctal[8] = "222.364.223.223";
        ipsOctal[9] = "378.015.255.160"; // not valid

        // create a pattern
        Pattern patternOctal = Pattern.compile(regexOctal);

        // get a matcher object

        for (String ipOctal: ipsOctal) {
            Matcher matcher = patternOctal.matcher(ipOctal);
            if (matcher.find())
                System.out.println(matcher.group() + " is valid");
            else
                System.out.println(ipOctal + " not valid");
        }

        System.out.println("========== BINARY IPS =============");

        String zeroTo255Bin = "((0|1){8})";
        String regexBin = "^" + zeroTo255Bin + "\\." + zeroTo255Bin + "\\." + zeroTo255Bin + "\\." + zeroTo255Bin + "$";
        String[] ipsBin = new String[10];

        ipsBin[0] = "10111100.11100001.10011000.00100001";
        ipsBin[1] = "10110000.00010100.10000010.00110111";
        ipsBin[2] = "11001100.00101100.11001101.11111101";
        ipsBin[3] = "111011011.01101010.00111110.11111101"; // not valid
        ipsBin[4] = "00111001.00101010.11111011.00100001";
        ipsBin[5] = "10100010.10000010.01111110.00100110";
        ipsBin[6] = "11000010.11111110.00011110.01111110";
        ipsBin[7] = "11111100.10001100.00011011.110111111"; // not valid
        ipsBin[8] = "01111110.11111010.11000010.01001111";
        ipsBin[9] = "00101001.00000111.00110101.00100011";

        // create a pattern
        Pattern patternBin = Pattern.compile(regexBin);

        // get a matcher object

        for (String ipBin: ipsBin) {
            Matcher matcher = patternBin.matcher(ipBin);
            if (matcher.find())
                System.out.println(matcher.group() + " is valid");
            else
                System.out.println(ipBin + " not valid");
        }

        System.out.println("=========== PARENTHESIS MATCH ==============");

        System.out.println("IMPOSSIBLE WITHOUT RECURSION");


    }

}
