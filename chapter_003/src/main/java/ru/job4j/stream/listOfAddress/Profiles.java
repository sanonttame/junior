package ru.job4j.stream.listOfAddress;

import java.util.*;
import java.util.stream.Collectors;
/**
 * class Profiles
 * @version 0.1
 * @since 0.1
 * @author Anton Tsyoma
 */
class Profiles {
    /**
     * Collect addresses
     * @param profiles profiles
     * @return list of address
     */
    List<Address> collect(List<Profile> profiles){
        return profiles.stream().map((profile)->profile.getAddress()).collect(Collectors.toList());
    }
}
