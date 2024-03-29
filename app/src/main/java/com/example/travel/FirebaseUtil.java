package com.example.travel;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class FirebaseUtil {
    public static FirebaseDatabase mFirebaseDatabase;
    public static DatabaseReference mDatabaseReference;
    private static FirebaseUtil firebaseUtil;
    public static ArrayList<Traveldeal> mDeals;

    private FirebaseUtil(){};

    public static void openFbReference(String ref){
        if (firebaseUtil == null){
            firebaseUtil = new FirebaseUtil();
            mFirebaseDatabase = FirebaseDatabase.getInstance();
            mDeals = new ArrayList<Traveldeal>();
        }
        mDatabaseReference = mFirebaseDatabase.getReference().child(ref);
    }
}
