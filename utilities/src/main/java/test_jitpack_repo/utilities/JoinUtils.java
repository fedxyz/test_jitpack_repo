/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package test_jitpack_repo.utilities;

import test_jitpack_repo.list.LinkedList;

class JoinUtils {
    public static String join(LinkedList source) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < source.size(); ++i) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(source.get(i));
        }

        return result.toString();
    }
}
