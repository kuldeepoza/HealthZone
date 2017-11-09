package healthzone.com.example.kuldeep.healthzone;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by kuldeep on 10/12/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String Database_name="healthzone.db";
    private static final String signup_table="signup";
    private static final String user_detail_table="user_detail";
    private static final String exercise_table="exercise";
    private static final String disease_table="disease";
    private static final String vegetable_table="vegetable";
    private static final String frutes_table="frutes";
    private static final String liquid_table="liquid";
    private static final String chart_table="chart";

    public DatabaseHelper(Context context) {
        super(context, Database_name, null, 1);
      //  SQLiteDatabase db=this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       db.execSQL("create table "+signup_table+"(id integer primary key autoincrement,email text,password text,phone text)");
        db.execSQL("create table "+user_detail_table+"(uid integer primary key autoincrement,uname text,age text,weight text,disease text,height text,choice text,extraDetail text,incDecWeight text,chartChoice text)");
     //   db.execSQL("create table "+exercise_table+"(eid integer primary key autoincrement,ename text,count integer,did foreign key(did)");
        db.execSQL("create table "+disease_table+"(did integer primary key autoincrement,dname text,bodypart text,medicine text)");
        db.execSQL("create table "+vegetable_table+"(vid integer primary key autoincrement,vname text,calary integer,vitamin text)");
        db.execSQL("create table "+frutes_table+"(fid integer primary key autoincrement,fname text,calary integer,vitamin text)");
        db.execSQL("create table "+liquid_table+"(lid integer primary key autoincrement,lname text,disease text)");
      //  db.execSQL("create table "+chart_table+"(cid integer primary key autoincrement,breakfast text,lunch text,snakes text,dinner text,exercise text,disease text,extra text");

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("drop table if exists "+signup_table);
        onCreate(db);
    }
public Boolean insertData(String email, String number, String password) {
    SQLiteDatabase db = this.getWritableDatabase();
    ContentValues cv = new ContentValues();
    cv.put("email", email);
    cv.put("password", password);
    cv.put("phone", number);
    long re = db.insert(signup_table, null, cv);
    if (re == -1) {

        return false;
    } else

    {
        return true;
    }
}
public Boolean insertUserDetail(String name,String age,String weight,String disease,String height,String choice,String extra,String incdecWeight,String chartChoice )
{
    SQLiteDatabase db = this.getWritableDatabase();
    ContentValues cv = new ContentValues();
    cv.put("uname", name);
    cv.put("age", age);
    cv.put("weight", weight);
    cv.put("disease", disease);
    cv.put("height", height);
    cv.put("choice", choice);
    cv.put("extraDetail", extra);
    cv.put("incDecWeight", incdecWeight);
    cv.put("chartChoice", chartChoice);

   long re= db.insert(user_detail_table, null, cv);
    if (re == -1) {

        return false;
    } else

    {
        return true;
    }
}

    public Cursor getBreakfast()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        String query="select * from "+frutes_table+" where calary >= 50";
        Cursor cursor=db.rawQuery(query,null);
        return cursor;
    }

    public Cursor getLunch()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        String query="select * from "+vegetable_table+" where calary >= 100";
       Cursor cursor=db.rawQuery(query,null);
        return cursor;
    }

    public Cursor getSnacks()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        String query="select * from "+liquid_table;
        Cursor cursor=db.rawQuery(query,null);
        return cursor;
    }

    public Cursor getDinner()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        String query="select * from "+vegetable_table+" where calary >= 100";
        Cursor cursor=db.rawQuery(query,null);
        return cursor;
    }

    public Boolean insertLiquid()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("lname", "pomegrant juice,coffee,soy milk,tomato juice,graps juice,black tee");
        cv.put("disease", "heart");
       db.insert(liquid_table, null, cv);

        ContentValues cv2 = new ContentValues();
        cv2.put("lname", "green tee,olive oil,energy drinks");
        cv2.put("disease", "brain");
        db.insert(liquid_table, null, cv2);

        ContentValues cv3 = new ContentValues();
        cv3.put("lname", "lomon juice,tea once a day,lots of water,green tea,strawberries juice,");
        cv3.put("disease", "liver");
        db.insert(liquid_table, null, cv3);

        ContentValues cv4 = new ContentValues();
        cv4.put("lname", "herbal tea,water,green vegetables soup,Cranberry Juice,Beet Juice,");
        cv4.put("disease", "kidney");
        db.insert(liquid_table, null, cv4);

        ContentValues cv5 = new ContentValues();
        cv5.put("lname", " Ice cream,coffee, hot cereal,milk,beans soup");
        cv5.put("disease", "lungs");
        db.insert(liquid_table, null, cv5);

        ContentValues cv6 = new ContentValues();
        cv6.put("lname", "Coconut Oil,Coffee,Orange Juice,water");
        cv6.put("disease", "Thyroid");
        db.insert(liquid_table, null, cv6);

        ContentValues cv7 = new ContentValues();
        cv7.put("lname", "soda,colcacola,hard drik");
        cv7.put("disease", "chest");
        db.insert(liquid_table, null, cv7);

        ContentValues cv8 = new ContentValues();
        cv8.put("lname", "Watermelon Smoothie,Iced Peppermint Tea,Pineapple Frappe,Green Tea,Dark Chocolate Shake");
        cv8.put("disease", "belly");
        db.insert(liquid_table, null, cv8);

        ContentValues cv9 = new ContentValues();
        cv9.put("lname", "coffee,curd hams,soda,canned soup,Canned or bottled tomato juice,alcohol,");
        cv9.put("disease", "blood pressure");
        db.insert(liquid_table, null, cv9);

        ContentValues cv10 = new ContentValues();
        cv10.put("lname", "Water,Unsweetened teas,Coffee,Diet soda,Other low-calorie drinks and drink mixes,sugar free milk");
        cv10.put("disease", "Diabetes");
        db.insert(liquid_table, null, cv10);

        return true;
    }
    public void insertDisease()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("dname", "AIDS");
        cv.put("bodypart", "Immune system of the body");
        cv.put("medicine","Fusion Inhibitors,NonNucleoside Reverse Transcriptase Inhibitors,Nucleoside Reverse Transcriptase Inhibitors,Protease Inhibitors");
         db.insert(disease_table, null, cv);


        ContentValues cv2 = new ContentValues();
        cv2.put("dname", "Arthritis");
        cv2.put("bodypart", "Joints");
        cv2.put("medicine","Acetaminophen,Adrenocorticoids (Oral Inhalation),Adrenocorticoids (Systemic),Anakinra,Antihistamines,Nonsedating,COX2,Inhibitors,NSAIDs,Aspirin");
        db.insert(disease_table, null, cv2);


        ContentValues cv3 = new ContentValues();
        cv3.put("dname", "Asthma");
        cv3.put("bodypart", "muscles");
        cv3.put("medicine","Adrenocorticoids (Nasal Inhalation),Adrenocorticoids (Oral Inhalation),Bronchodilators, Adrenergic,Cromolyn,Ephedrine,Ipratropium,Leukotriene Modifiers");
        db.insert(disease_table, null, cv3);



        ContentValues cv4 = new ContentValues();
        cv4.put("dname", "Bronchitis");
        cv4.put("bodypart", "Lungs");
        cv4.put("medicine","Bronchodilators, Xanthine,Cephalosporins,Dextromethorphan,Fluoroquinolones,Ipratropium,Macrolide Antibiotics,Sulfonamides");
        db.insert(disease_table, null, cv4);


        ContentValues cv5 = new ContentValues();
        cv5.put("dname", "Conjunctivitis");
        cv5.put("bodypart", "Eye");
        cv5.put("medicine","Antibacterials (Ophthalmic),Antivirals (Ophthalmic)");
        db.insert(disease_table, null, cv5);


        ContentValues cv6 = new ContentValues();
        cv6.put("dname", "Dermatitis");
        cv6.put("bodypart", "Skin");
        cv6.put("medicine","Adrenocorticoids (Systemic),Adrenocorticoids (Topical),Anesthetics (Topical),Coal Tar,Colchicine,Dapsone,Keratolytics");
        db.insert(disease_table, null, cv6);


        ContentValues cv7 = new ContentValues();
        cv7.put("dname", "Diabetes");
        cv7.put("bodypart", "blood");
        cv7.put("medicine","Acarbose,Antidiabetic Agents Sulfonylurea,Insulin,Insulin Analogs,Meglitinides,Metformin,Miglitol,Thiazolidinediones");
        db.insert(disease_table, null, cv7);


        ContentValues cv8 = new ContentValues();
        cv8.put("dname", "Eczema");
        cv8.put("bodypart", "Skin");
        cv8.put("medicine","Adrenocorticoids (Topical),Antibacterials, Antifungals (Topical),Coal Tar,Doxepin (Topical),Keratolytics");
        db.insert(disease_table, null, cv8);


        ContentValues cv9 = new ContentValues();
        cv9.put("dname", "Ear Infections");
        cv9.put("bodypart", "Ear");
        cv9.put("medicine","Antibacterials (Otic),AntiInflammatory Drugs, Steriodal (Otic),Antipyrine,Phenylephrine");
        db.insert(disease_table, null, cv9);

        ContentValues cv10 = new ContentValues();
        cv10.put("dname", "Kidney Stones");
        cv10.put("bodypart", "Kidney");
        cv10.put("medicine","Allopurinol,Cellulose Sodium Phosphate,Citrates,Diuretics, Thiazide,Penicillamine,Sodium Bicarbonate");
        db.insert(disease_table, null, cv10);

        ContentValues cv11 = new ContentValues();
        cv11.put("dname", "Kidney Stones");
        cv11.put("bodypart", "Mouth");
        cv11.put("medicine","Anesthetics (MucosalLocal)");
        db.insert(disease_table, null, cv11);

        ContentValues cv12 = new ContentValues();
        cv12.put("dname", "Pain");
        cv12.put("bodypart", "any");
        cv12.put("medicine","Acetaminophen,Acetaminophen and Salicylates,NSAIDs,Aspirin,Barbiturates, Aspirin and Codeine,Butorphanol,Carbamazepine,Narcotic Analgesics,Salicylates,Tramadol,Trazodone");
        db.insert(disease_table, null, cv12);

        ContentValues cv13 = new ContentValues();
        cv13.put("dname", "Sleep Apnea");
        cv13.put("bodypart", "sleep");
        cv13.put("medicine","Antidepressants,Tricyclic,Modafanil,Progestins,Theophylline");
        db.insert(disease_table, null, cv13);

        ContentValues cv14 = new ContentValues();
        cv14.put("dname", "Cancer");
        cv14.put("bodypart", "any body part");
        cv14.put("medicine","Adrenocorticoids (Systemic),Aminoglutethimide,Androgens,Antiandrogens, Nonsteroidal,Antifungals, Azoles,Busulfan,Capecitabine,Cholarmbucil,Cyclophosphamide,Estramustine,Estrogens,Etoposide,Flutamide,Hydroxyurea,Imatinib,Levamisole,Lomustine,Melphalan");
        db.insert(disease_table, null, cv14);

        ContentValues cv15 = new ContentValues();
        cv15.put("dname", "Chickenpox");
        cv15.put("bodypart", "Skin");
        cv15.put("medicine","Acetaminophen,Antihistamines,Antivirals for Herpes Virus");
        db.insert(disease_table, null, cv15);

        ContentValues cv16 = new ContentValues();
        cv16.put("dname", "Cholesterol");
        cv16.put("bodypart", "belly");
        cv16.put("medicine","Cholestyramine,Colestipol,Ezetimibe,Gemfibrozil,Neomycin (Oral),Niacin,Raloxifene");
        db.insert(disease_table, null, cv16);

        ContentValues cv17 = new ContentValues();
        cv17.put("dname", "Heart Failure");
        cv17.put("bodypart", "Heart");
        cv17.put("medicine","Digitalis Preparations,BetaAdrenergic Blocking Agents,Nitrates,Diuretics,Thiazide,Hydrochlorothiazide");
        db.insert(disease_table, null, cv17);

        ContentValues cv18 = new ContentValues();
        cv18.put("dname", "Depression");
        cv18.put("bodypart", "Mind");
        cv18.put("medicine","Antidepressants, Tricyclic,Bupropion,Ergoloid Mesylates,Loxapine,Maprotiline,Methylphenidate,Monoamine Oxidase Inhibitors,Nefazodone,Selegiline");
        db.insert(disease_table, null, cv18);


        ContentValues cv19 = new ContentValues();
        cv19.put("dname", "Fever");
        cv19.put("bodypart", "body");
        cv19.put("medicine","Acetaminophen,Aspirin,Chlorzaxozine,Narcotic Analgesics and Aspirin,Salicylates");
        db.insert(disease_table, null, cv19);

        ContentValues cv20 = new ContentValues();
        cv20.put("dname", "Hair Loss");
        cv20.put("bodypart", "Hair");
        cv20.put("medicine","Antharil (Topical),Finasteride,Minoxidil");
        db.insert(disease_table, null, cv20);


        ContentValues cv21 = new ContentValues();
        cv21.put("dname", "Headache");
        cv21.put("bodypart", "Mind");
        cv21.put("medicine","Acetaminophen (Fioricet),Antidepressants, Tricyclic,Antihistamines,NSAIDs,Aspirin,Barbiturates, Aspirin and Codeine,Buspirone,Caffeine,Clonidine,Ergotamine,Isometheptene, Dichloralphenazone and Acetaminophen,Methysergide,Triptans");
        db.insert(disease_table, null, cv21);

        ContentValues cv22 = new ContentValues();
        cv21.put("dname", "Flu");
        cv21.put("bodypart", "Any body part");
        cv21.put("medicine","Antivirals for Influenza,Ribavirin,Antivirals for Influenza");
        db.insert(disease_table, null, cv21);

        ContentValues cv23 = new ContentValues();
        cv23.put("dname", "Malaria");
        cv23.put("bodypart", "blood");
        cv23.put("medicine","Antimalarial,Atovaquone,Chloroquine,Primaquine,Proguanil,Quinidine");
        db.insert(disease_table, null, cv23);

        ContentValues cv24 = new ContentValues();
        cv24.put("dname", "blood Pressure");
        cv24.put("bodypart", "blood");
        cv24.put("medicine","Alpha Adrenergic Receptor Blockers,Angiotensin II Receptor Antagonists,AngiotensinConverting Enzyme (ACE) Inhibitors,Hydrochlorothiazide,Clonidine");
        db.insert(disease_table, null, cv24);

    }



    public Boolean insertFruites() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("fname", "apple");
        cv.put("calary", 95);
        cv.put("vitamin", "ab");
         db.insert(frutes_table, null, cv);
        ContentValues cv3 = new ContentValues();
        cv3.put("fname", "banana");
        cv3.put("calary", 107);
        cv3.put("vitamin", "bc");
        db.insert(frutes_table, null, cv3);

        ContentValues cv4 = new ContentValues();
        cv4.put("fname", "blackberries");
        cv4.put("calary", 1);
        cv4.put("vitamin", "ck");
       db.insert(frutes_table, null, cv4);
       ContentValues cv5 = new ContentValues();
        cv5.put("fname", "cantaloupe");
        cv5.put("calary", 10);
        cv5.put("vitamin", "ca");
        long re5 = db.insert(frutes_table, null, cv5);


        ContentValues cv6 = new ContentValues();
        cv6.put("fname", "cherries");
        cv6.put("calary", 24);
        cv6.put("vitamin", "b");
        long re6 = db.insert(frutes_table, null, cv6);
        ContentValues cv7 = new ContentValues();
        cv7.put("fname", "graps");
        cv7.put("calary", 2);
        cv7.put("vitamin", "bc");
        long re7 = db.insert(frutes_table, null, cv7);



        ContentValues cv8 = new ContentValues();
        cv8.put("fname", "grapefruit");
        cv8.put("calary", 100);
        cv8.put("vitamin", "c");
        long re8 = db.insert(frutes_table, null, cv8);
        ContentValues cv9 = new ContentValues();
        cv9.put("fname", "guarva");
        cv9.put("calary", "60");
        cv9.put("vitamin", "c");
        long re9 = db.insert(frutes_table, null, cv9);



        ContentValues cv10 = new ContentValues();
        cv10.put("fname", "mango");
        cv10.put("calary", 40);
        cv10.put("vitamin", "ac");
        long re10 = db.insert(frutes_table, null, cv10);
        ContentValues cv11 = new ContentValues();
        cv11.put("fname", "orange");
        cv11.put("calary", 65);
        cv11.put("vitamin", "c");
        long re11 = db.insert(frutes_table, null, cv11);


        ContentValues cv12 = new ContentValues();
        cv12.put("fname", "pineapple");
        cv12.put("calary", 50);
        cv12.put("vitamin", "c");
        long re12 = db.insert(frutes_table, null, cv12);
        ContentValues cv13 = new ContentValues();
        cv13.put("fname", "watermalen");
        cv13.put("calary", 23);
        cv13.put("vitamin", "cab");
        long re13 = db.insert(frutes_table, null, cv13);


        ContentValues cv14 = new ContentValues();
        cv14.put("fname", "tangerines");
        cv14.put("calary", 26);
        cv14.put("vitamin", "ac");
        long re14 = db.insert(frutes_table, null, cv14);
        ContentValues cv15 = new ContentValues();
        cv15.put("fname", "kiwi");
        cv15.put("calary", 34);
        cv15.put("vitamin", "ea");
        long re15 = db.insert(frutes_table, null, cv15);


        ContentValues cv16 = new ContentValues();
        cv16.put("fname", "lemon");
        cv16.put("calary", 18);
        cv16.put("vitamin", "cb");
        long re16 = db.insert(frutes_table, null, cv16);
        ContentValues cv17 = new ContentValues();
        cv17.put("fname", "melon");
        cv17.put("calary", 15);
        cv17.put("vitamin", "ab");
        long re17 = db.insert(frutes_table, null, cv17);


        ContentValues cv18 = new ContentValues();
        cv18.put("fname", "pumpkin");
        cv18.put("calary", 20);
        cv18.put("vitamin", "ck");
        long re18 = db.insert(frutes_table, null, cv18);
        ContentValues cv19 = new ContentValues();
        cv19.put("fname", "plum");
        cv19.put("calary", 25);
        cv19.put("vitamin", "ac");
        long re19 = db.insert(frutes_table, null, cv19);
        return true;
    }
    public boolean insertVeg() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("vname", "Asparagus");
        cv.put("calary", 11);
        cv.put("vitamin", "k");
        long re2 = db.insert(vegetable_table, null, cv);
        ContentValues cv3 = new ContentValues();
        cv3.put("vname", "beans");
        cv3.put("calary", 108);
        cv3.put("vitamin", "b");
        long re3 = db.insert(vegetable_table, null, cv3);

        ContentValues cv4 = new ContentValues();
        cv4.put("vname", "broccoli");
        cv4.put("calary", 35);
        cv4.put("vitamin", "be");
        long re4 = db.insert(vegetable_table, null, cv4);
        ContentValues cv5 = new ContentValues();
        cv5.put("vname", "cabbage");
        cv5.put("calary", 41);
        cv5.put("vitamin", "kc");
        long re5 = db.insert(vegetable_table, null, cv5);


        ContentValues cv6 = new ContentValues();
        cv6.put("vname", "carrots");
        cv6.put("calary", 52);
        cv6.put("vitamin", "kc");
        long re6 = db.insert(vegetable_table, null, cv6);
        ContentValues cv7 = new ContentValues();
        cv7.put("vname", "cailiflower");
        cv7.put("calary", 23);
        cv7.put("vitamin", "aeck");
        long re7 = db.insert(vegetable_table, null, cv7);



        ContentValues cv8 = new ContentValues();
        cv8.put("vname", "celey");
        cv8.put("calary", 14);
        cv8.put("vitamin", "kcb");
        long re8 = db.insert(vegetable_table, null, cv8);
        ContentValues cv9 = new ContentValues();
        cv9.put("vname", "corn");
        cv9.put("calary", 80);
        cv9.put("vitamin", "b");
        long re9 = db.insert(vegetable_table, null, cv9);



        ContentValues cv10 = new ContentValues();
        cv10.put("vname", "cucumber");
        cv10.put("calary", 7);
        cv10.put("vitamin", "kc");
        long re10 = db.insert(vegetable_table, null, cv10);
        ContentValues cv11 = new ContentValues();
        cv11.put("vname", "lentis");
        cv11.put("calary", 115);
        cv11.put("vitamin", "b");
        long re11 = db.insert(vegetable_table, null, cv11);




        ContentValues cv12 = new ContentValues();
        cv12.put("vname", "lettuce");
        cv12.put("calary", 8);
        cv12.put("vitamin", "bcae");
        long re12 = db.insert(vegetable_table, null, cv12);
        ContentValues cv13 = new ContentValues();
        cv13.put("vname", "mushroom");
        cv13.put("calary", 20);
        cv13.put("vitamin", "cb");
        long re13 = db.insert(vegetable_table, null, cv13);


        ContentValues cv14 = new ContentValues();
        cv14.put("vname", "onion");
        cv14.put("calary", 36);
        cv14.put("vitamin", "c");
        long re14 = db.insert(vegetable_table, null, cv14);
        ContentValues cv15 = new ContentValues();
        cv15.put("vname", "peas");
        cv15.put("calary", 36);
        cv15.put("vitamin", "kbc");
        long re15 = db.insert(vegetable_table, null, cv15);


        ContentValues cv16 = new ContentValues();
        cv16.put("vname", "peppers");
        cv16.put("calary", 18);
        cv16.put("vitamin", "cbe");
        long re16 = db.insert(vegetable_table, null, cv16);
        ContentValues cv17 = new ContentValues();
        cv17.put("vname", "potato");
        cv17.put("calary", 255);
        cv17.put("vitamin", "bc");
        long re17 = db.insert(vegetable_table, null, cv17);


        ContentValues cv18 = new ContentValues();
        cv18.put("vname", "pumpkin");
        cv18.put("calary", 23);
        cv18.put("vitamin", "be");
        long re18 = db.insert(vegetable_table, null, cv18);
        ContentValues cv19 = new ContentValues();
        cv19.put("vname", "spinch");
        cv19.put("calary", 20);
        cv19.put("vitamin", "kab");
        long re19 = db.insert(vegetable_table, null, cv19);

        ContentValues cv20 = new ContentValues();
        cv20.put("vname", "tomato");
        cv20.put("calary", 11);
        cv20.put("vitamin", "ckae");
        long re20 = db.insert(vegetable_table, null, cv20);


        return true;
    }

    public Cursor getData(String email)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        String query="select * from "+signup_table+" where email = '" + email + "'";
        Cursor cursor=db.rawQuery(query,null);
        return cursor;
    }
    public Cursor getHeadaque()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        String query="select * from "+disease_table+" where dname = 'Headache'";
        Cursor cursor=db.rawQuery(query,null);
        return cursor;
    }
    public Cursor getBloodPressure()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        String query="select * from "+disease_table+" where dname = 'blood Pressure'";
        Cursor cursor=db.rawQuery(query,null);
        return cursor;
    }
    public Cursor getDibetise()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        String query="select * from "+disease_table+" where dname = 'Diabetes'";
        Cursor cursor=db.rawQuery(query,null);
        return cursor;
    }

}
