         import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean match = false;
        for (int i=0; i<array.length; i++)
        {
            if (value.equals(array[i])) 
            {match = true;
                break;
            }
        }
        return match;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reversedArray = new String[array.length];
        
        for (int i=0; i<array.length; i++)
        {
            reversedArray[array.length - (i + 1)] = array[i];
        }

        return reversedArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        
        String[] reversedArray = new String[array.length];
        
        for (int i=0; i<array.length; i++)
        {
            reversedArray[array.length - (i + 1)] = array[i];
        }
        
        return Arrays.equals(array, reversedArray);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        int nextPosition = 0;
        char[] tracker = new char[26];
        int trackerCount = 0;
        
        //merge string array into one string & convert to lower case
        String merged = "";
        
        for (int i=0; i<array.length; i++) {
            merged += array[i];
        }
        
        merged = merged.toLowerCase();
        
        // run through string and add new char to tracker array
        for (int i=0; i<merged.length(); i++) {
            if (Arrays.binarySearch(tracker, merged.charAt(i)) < 0) {
                tracker[i] = merged.charAt(i);
                Arrays.sort(tracker);
                nextPosition ++;
            }
        }
        
        for (int i=0; i<26; i++) {
            if (tracker[i] != '\u0000') {
                trackerCount ++;
            }

        }
        return trackerCount == 26;
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int tracker = 0;
        
        for (String item : array) {
            if (item == value) {
                tracker = tracker + 1;
            }

    }
    return tracker;
}

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        //count number of words to be removed
        int toRemove = 0;
            
        for (String item : array) {
            if (item == valueToRemove) {
                toRemove = toRemove + 1;
            }
        }
        
        int newArraySize = array.length - toRemove;
        
        //create new array with words removed
        String[] newArray = new String[newArraySize];
        
        int tracker = 0;
        
        for (String item : array) {
            if (!item.equals(valueToRemove)) {
                newArray[tracker] = item;
                tracker ++;
            }

        }   
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
                //count number of words to be removed
        int toRemove = 0;
        
        for (int i=0; i<array.length-1; i++) {
            if (array[i].equals(array[i+1])) {
                toRemove = toRemove + 1;
            }
        }
        
        int newArraySize = array.length - toRemove;
        
        //create new array with words removed
        String[] newArray = new String[newArraySize];
        int tracker = 0;
            for (int i=0; i<array.length-1; i++) {
            
                if (!array[i].equals(array[i+1])) {
                newArray[tracker] = array[i];
                tracker ++;
            }
            newArray[tracker] = array[array.length - 1];
        }   
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int charDups = 0;
        int newArraySize = 0;
        int i = 0;
        int j = 0;
        while (i < array.length-1) {
            j = i;
            while (array[j].equals(array[j+1])) {
                charDups ++;
                j++;
            }
            newArraySize ++;
            i = j + 1;
        }
        
        if (
        
        
        String[] newArray = new String[newArraySize];
        
        //loop to create new array
        int tracker = 0;
        for (int k=0; k<array.length-1; k++) {
            String newString = "";
            int p = k;
            while (array[p].equals(array[p+1])) {
                newString = newString + array[k];
                p++;
            }
        newArray[tracker] = newString;
        tracker ++;
    }
        
        
        return newArray;
    }


}
