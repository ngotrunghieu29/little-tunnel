package little.tunnel.util;

import little.tunnel.Config;

import java.util.HashMap;
import java.util.Map;

/**
 * Holder of hard-written patches
 */
public class PatchManager {

    private static final Map<String, Integer> CHUNK_SIZE = new HashMap<>();

    public static int load() {
        if (CHUNK_SIZE.size() == 0) {
            fill();
        }
        return CHUNK_SIZE.size();
    }

    private static void fill() {
        //CHUNK_SIZE.put("linkedin.com", 10); //don't working
    }

    public static int getChunkSize(String address) {
        address = address.toLowerCase();
        if (CHUNK_SIZE.containsKey(address)) {
            return CHUNK_SIZE.get(address);
        } else {
            return Config.DEFAULT_CHUNK_SIZE;
        }
    }
}
