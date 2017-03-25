package com.example.ncrsoft.food.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.example.ncrsoft.food.R;
import com.example.ncrsoft.food.adapter.ExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {
    public View rootview;
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;


    public CategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootview =  inflater.inflate(R.layout.fragment_category, container, false);

        expListView = (ExpandableListView)rootview.findViewById(R.id.lvExp);
        prepareListData();

        listAdapter = new ExpandableListAdapter(getActivity(), listDataHeader, listDataChild);
        expListView.setAdapter(listAdapter);
        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getActivity(),
                        listDataHeader.get(groupPosition) + " Expanded",
                        Toast.LENGTH_SHORT).show();
            }
        });

        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getActivity(),
                        listDataHeader.get(groupPosition) + " Collapsed",
                        Toast.LENGTH_SHORT).show();

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if(groupPosition == 0)
                switch (childPosition){
                    case 0:
                        MobileAccessoriesFragment mobileAccessoriesFragment = new MobileAccessoriesFragment();
                        fragmentTransaction.replace(R.id.containerView,mobileAccessoriesFragment);
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                        break;
                    case 1:
                        MobilesFragment mobilesFragment = new MobilesFragment();
                        fragmentTransaction.replace(R.id.containerView,mobilesFragment);
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                        break;
                }
                else if(groupPosition == 1){
                    switch (childPosition){
                        case 0:
                            KitchenAppliancesFragment kitchenAppliancesFragment = new KitchenAppliancesFragment();
                            fragmentTransaction.replace(R.id.containerView,kitchenAppliancesFragment);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case 1:
                            SmallHomeAppliancesFragment smallHomeAppliancesFragment = new SmallHomeAppliancesFragment();
                            fragmentTransaction.replace(R.id.containerView,smallHomeAppliancesFragment);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                    }

                }
                else if(groupPosition == 2){
                    switch (childPosition){
                        case 0:
                            KitchenAppliancesFragment kitchenAppliancesFragment = new KitchenAppliancesFragment();
                            fragmentTransaction.replace(R.id.containerView,kitchenAppliancesFragment);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case 1:
                            SmallHomeAppliancesFragment smallHomeAppliancesFragment = new SmallHomeAppliancesFragment();
                            fragmentTransaction.replace(R.id.containerView,smallHomeAppliancesFragment);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                    }

                }
                else if(groupPosition == 3){
                    switch (childPosition){
                        case 0:
                            KitchenAppliancesFragment kitchenAppliancesFragment = new KitchenAppliancesFragment();
                            fragmentTransaction.replace(R.id.containerView,kitchenAppliancesFragment);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case 1:
                            SmallHomeAppliancesFragment smallHomeAppliancesFragment = new SmallHomeAppliancesFragment();
                            fragmentTransaction.replace(R.id.containerView,smallHomeAppliancesFragment);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                    }

                }
                else if(groupPosition == 4){
                    switch (childPosition){
                        case 0:
                            KitchenAppliancesFragment kitchenAppliancesFragment = new KitchenAppliancesFragment();
                            fragmentTransaction.replace(R.id.containerView,kitchenAppliancesFragment);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case 1:
                            SmallHomeAppliancesFragment smallHomeAppliancesFragment = new SmallHomeAppliancesFragment();
                            fragmentTransaction.replace(R.id.containerView,smallHomeAppliancesFragment);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                    }

                }
                else if(groupPosition == 5){
                    switch (childPosition){
                        case 0:
                            KitchenAppliancesFragment kitchenAppliancesFragment = new KitchenAppliancesFragment();
                            fragmentTransaction.replace(R.id.containerView,kitchenAppliancesFragment);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case 1:
                            SmallHomeAppliancesFragment smallHomeAppliancesFragment = new SmallHomeAppliancesFragment();
                            fragmentTransaction.replace(R.id.containerView,smallHomeAppliancesFragment);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                    }

                }
                else if(groupPosition == 6){
                    switch (childPosition){
                        case 0:
                            KitchenAppliancesFragment kitchenAppliancesFragment = new KitchenAppliancesFragment();
                            fragmentTransaction.replace(R.id.containerView,kitchenAppliancesFragment);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case 1:
                            SmallHomeAppliancesFragment smallHomeAppliancesFragment = new SmallHomeAppliancesFragment();
                            fragmentTransaction.replace(R.id.containerView,smallHomeAppliancesFragment);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                    }

                }


                return false;
            }
        });

        return rootview;
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Electronics");
        listDataHeader.add("Appliances");
        listDataHeader.add("Women");
        listDataHeader.add("Men");
        listDataHeader.add("Baby And Kids");
        listDataHeader.add("Books And More");
        listDataHeader.add("Home And Furniture");


        // Adding child data
        List<String> electronics = new ArrayList<String>();
        electronics.add("Mobile Accessories");
        electronics.add("Mobiles");
        electronics.add("TVs");
        electronics.add("Laptops");
        electronics.add("Computer Accessories");
        electronics.add("Camera");
        electronics.add("Camera Accessories");
        electronics.add("Tablets");
        electronics.add("Home Entertainment");
        electronics.add("Computer Peripherals");
        electronics.add("Network Components");

        List<String> appliances = new ArrayList<String>();
        appliances.add("Kitchen Appliances");
        appliances.add("Small Home Appliances");
        appliances.add("Washing Machine");
        appliances.add("Refrigerator");
        appliances.add("Air Conditions");
        appliances.add("Geyser");

        List<String> women = new ArrayList<String>();
        women.add("Ethnic Wear");
        women.add("Western Wear");
        women.add("Seasonal/Winter Wear");
        women.add("Lingerie and Night wear");
        women.add("Footwear");
        women.add("Accessories");
        women.add("Personal care appliances");
        women.add("Jewellery");
        women.add("Clothing");
        women.add("Watches");
        women.add("Beauty and Grooming");

        List<String> men = new ArrayList<String>();
        men.add("Clothing");
        men.add("Watches");
        men.add("Footwear");
        men.add("Accessories");
        men.add("Personal care appliances");
        men.add("Men Grooming");

        List<String> baby = new ArrayList<String>();
        baby.add("Kids clothing");
        baby.add("Boy Footwear");
        baby.add("Baby sitter");
        baby.add("Boy clothing");
        baby.add("Girl clothing");
        baby.add("Baby Girl clothing");
        baby.add("Baby Boy clothing");
        baby.add("Girl Footwear");
        baby.add("Baby Girl Footwear");
        baby.add("School supplies");
        baby.add("Toys");
        baby.add("Baby care products");

        List<String> books = new ArrayList<>();
        books.add("Books");
        books.add("Games");
        books.add("Music");
        books.add("Movies");
        books.add("Musical Instruments");
        books.add("Car Accessories");
        books.add("Bike Accessories");
        books.add("Sports Accessories");
        books.add("Fitness Accessories");
        books.add("Stationary");

        List<String> home = new ArrayList<>();
        home.add("Tools and Hardware");
        home.add("Decorations");
        home.add("Office Equipment");
        home.add("Furniture");
        home.add("Lighting");
        home.add("Dining and Service");
        home.add("Furnishing");
        home.add("Bags");
        home.add("Kitchen and Dining");

        listDataChild.put(listDataHeader.get(0), electronics);
        listDataChild.put(listDataHeader.get(1), appliances);
        listDataChild.put(listDataHeader.get(2), women);
        listDataChild.put(listDataHeader.get(3), men);
        listDataChild.put(listDataHeader.get(4), baby);
        listDataChild.put(listDataHeader.get(5), books);
        listDataChild.put(listDataHeader.get(6), home);

    }
}


