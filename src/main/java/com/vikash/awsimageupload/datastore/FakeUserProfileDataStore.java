package com.vikash.awsimageupload.datastore;

import com.vikash.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("d9526403-4019-4e77-91ed-29061c88880c"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("4a8c94b0-3453-4b61-93c1-9414f1edc18d"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
