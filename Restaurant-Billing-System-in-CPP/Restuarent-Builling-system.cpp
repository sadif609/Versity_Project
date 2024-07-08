//Ashiqul_Islam_sadif609
#include<bits/stdc++.h>
#include<time.h>
using namespace std;
string arr1[20],arr2[20],arr3[20],arr4[20],arr5[20],arr6[20];
int total=0,a=0,distanceMin=0,pl=0;
//dijsta
int minimumDist(int dist[], bool Tset[])
{
    int min=INT_MAX,index;

    for(int i=0; i<10; i++)
    {
        if(Tset[i]==false && dist[i]<=min)
        {
            min=dist[i];
            index=i;
        }
    }
    return index;
}
int Dijkstra(int graph[10][10],int src)
{
    int dist[10];
    bool Tset[10];

    for(int i = 0; i<10; i++)
    {
        dist[i] = INT_MAX;
        Tset[i] = false;
    }

    dist[src] = 0;   // Source vertex distance is set to zero.

    for(int i = 0; i<10; i++)
    {
        int m=minimumDist(dist,Tset);
        Tset[m]=true;
        for(int i = 0; i<10; i++)
        {

            if(!Tset[i] && graph[m][i] && dist[m]!=INT_MAX && dist[m]+graph[m][i]<dist[i])
                dist[i]=dist[m]+graph[m][i];
        }
    }
    // plaxe selct
    cout<<" the place which : ";
    cout<<endl;

    cout<<"\t\t [1] Jigatola \n";
    cout<<"\t\t [2] Shankor \n";
    cout<<"\t\t [3] Mohammadpur \n";
    cout<<"\t\t [4] Banglamotor \n";
    cout<<"\t\t [5] Mouchak\n";
    cout<<"\t\t [6] Malibagh \n";
    cout<<"\t\t [7] Panthopath\n";
    cout<<endl<<endl;
    cin>>pl;
    if(pl==5)
        pl=6;
    if(pl==6)
        pl=7;
    if(pl==7)
        pl=9;
    distanceMin=dist[pl]*2; // per kilomiter 2tk
    return distanceMin;

}
//djsta
void enter()

{
    int ch=0;

    cout<<"How many customer bill do u want to enter? : "<<endl;

    cin>>ch;
    cin.ignore();
    if(total==0)
    {
        total=ch+total;
        for(int i=0; i<ch; i++)
        {
            cout<<"\nEnter the Data of customer No "<<i+1<<endl<<endl;
            cout<<"Enter the name of customer : ";
            getline(cin,arr1[i]);
            cout<<endl;
            cout<<"Enter the code or username of customer : ";
            cin>>arr2[i];
            cout<<endl;
            cout<<"Enter the bill of cutomer : \n";
            cout<<endl;
            cout<<endl;
            //...........................
            cout<<"\t\t [0] Beef Biryani - BDT 120.00\n";
            cout<<"\t\t [1] Special Meal - BDT 160.00\n";
            cout<<"\t\t [2] Chiken Biryani - BDT 130.00\n";
            cout<<"\t\t [3] Beef Khichuri - BDT 80.00\n";
            cout<<"\t\t [4] Pasta - BDT 60.00\n";
            cout<<"\t\t [5] Sub Senduis - BDT 70.00\n";
            cout<<"\t\t [6] Hot Dog - BDT 50.00\n";
            cout<<"\t\t [7] Burger - BDT 80.00\n";
            cout<<"\t\t [8] Coke - BDT 20.00\n";
            cout<<"\t\t [9] Coffee - BDT 15.00\n";
            cout<<endl;
            cout<<endl;
            int n=9;
            for(int i=0; i<=n; i++)
            {
                cout<<"Please select what did you sell ?  :";
                int select,quantity;
                cin>>select;
                cout<<endl;
                switch (select)
                {
                case 0:
                    select=120;
                    break;
                case 1:
                    select=160;
                    break;
                case 2:
                    select=130;
                    break;
                case 3:
                    select=80;
                    break;
                case 4:
                    select=60;
                    break;
                case 5:
                    select=70;
                    break;
                case 6:
                    select=50;
                    break;
                case 7:
                    select=80;
                    break;
                case 8:
                    select=20;
                    break;
                case 9:
                    select=15;
                    break;
                default:
                    exit(0);
                    break;

                }
                cout<<"Enter the Quantity   :";
                cin>>quantity;
                cout<<endl;

                int multi=select*quantity;
                a=a+multi;
                cout<<"Did you sell anything else ?  ";
                cout<<"\t 1.YES\n2.No \n";
                cout<<endl;
                cout<<"Chose Your Option : ";
                int repeat;
                cin>>repeat;
                if(repeat==1)
                    continue;
                else if(repeat==2)
                    break;
            }
            string amount;
            stringstream ss;
            ss << a;
            ss >> amount;
            arr3[i]=amount;
            cout<<endl;
            cout<<"Enter Phone Number : ";
            cin>>arr4[i];
            cout<<endl;
            cout<<"Enter Date :  ";
            cin>>arr5[i];
            //part of home dlvry distanse.....................
            int dselect,sv,pv,kv=0,damount,ds; //sv=source vertix ,pv = place vertix
            cout<<"This was homee delivary ?    "<<endl<<endl<<"1 Yes "<<endl<<"2 No"<< endl<<" Please enter : ";
            cin>>dselect;
            cout<<endl;
            if(dselect==1)
            {
                int graph[10][10]=
                {
                    {0, 2, 10, 0, 0, 0, 0, 0, 0, 0},
                    {2, 0, 0, 0, 10, 0, 0, 0, 0, 0},
                    {10, 0, 0, 12, 0, 0, 30, 0, 0, 0},
                    {0, 0, 12, 0, 0, 0, 0, 14, 0, 15},
                    {0, 10, 0, 0, 0, 15, 0, 0, 0, 35},
                    {0, 0, 0, 0, 15, 0, 10, 0, 0, 0},
                    {0, 0, 30, 0, 0, 10, 0, 10, 0, 0},
                    {0, 0, 0, 14, 0, 0, 10, 0, 10, 0},
                    {0, 0, 0, 0, 0, 0, 0, 10, 0, 15},
                    {0, 0, 0, 15, 35, 0, 0, 0, 15, 0}
                };
                int sc;
                cout<<"Select the Restuarent brance : "<<endl;
                cout<<endl;
                cout<<"1 Dhanmondi Brance"<<endl<<"2 Mogbajar Brance "<<endl<<"3 Khilgaon Brance "<<endl;
                cout<<endl;
                cin>>ds;
                if(ds==1)
                    sc=0;
                if(ds==2)
                    sc=5;
                if(ds==3)
                    sc=8;
                Dijkstra(graph,sc);
                cout<<endl;
                cout<<" The Minimum cost of delivary : "<<distanceMin<<endl;
                string dplc;
                stringstream ss2;
                ss2 << distanceMin;
                ss2 >> dplc;
                arr6[i]=dplc;
                cout<<endl;
            }
            else
                arr6[i]="0";
            cin.ignore();
            a=0;
        }
    }
    else
    {
        cin.ignore();
        for(int i=total; i<ch+total; i++)
        {
            cout<<"\nEnter the Data of customer No "<<i+1<<endl<<endl;
            cout<<"Enter the name of customer :  ";
            getline(cin,arr1[i]);
            cout<<endl;
            cout<<"Enter the code or username of ustomer :";
            cin>>arr2[i];
            cout<<endl;
            cout<<"Enter the bill of cutomer\n";
            cout<<endl;
            cout<<endl;
            //...........................
            cout<<"\t\t [0] Beef Biryani - BDT 120.00\n";
            cout<<"\t\t [1] Special Meal - BDT 160.00\n";
            cout<<"\t\t [2] Chiken Biryani - BDT 130.00\n";
            cout<<"\t\t [3] Beef Khichuri - BDT 80.00\n";
            cout<<"\t\t [4] Pasta - BDT 60.00\n";
            cout<<"\t\t [5] Sub Senduis - BDT 70.00\n";
            cout<<"\t\t [6] Hot Dog - BDT 50.00\n";
            cout<<"\t\t [7] Burger - BDT 80.00\n";
            cout<<"\t\t [8] Coke - BDT 20.00\n";
            cout<<"\t\t [9] Coffee - BDT 15.00\n";
            cout<<endl;
            cout<<endl;
            int n=9;
            for(int i=0; i<=n; i++)
            {
                cout<<"Please select what did you sell ?  : ";
                int select,quantity;
                cin>>select;
                cout<<endl;
                switch (select)
                {
                case 0:
                    select=120;
                    break;
                case 1:
                    select=160;
                    break;
                case 2:
                    select=130;
                    break;
                case 3:
                    select=80;
                    break;
                case 4:
                    select=60;
                    break;
                case 5:
                    select=70;
                    break;
                case 6:
                    select=50;
                    break;
                case 7:
                    select=80;
                    break;
                case 8:
                    select=20;
                    break;
                case 9:
                    select=15;
                    break;
                default:
                    exit(0);
                    break;

                }
                cout<<"Enter the Quantity  :";
                cin>>quantity;
                cout<<endl;

                int multi=select*quantity;
                a=a+multi;

                cout<<"Did you sell anything else ? ";
                cout<<"\t 1.YES\n2.No \n";
                cout<<endl;
                cout<<"Chose Your Option : ";
                int repeat;
                cin>>repeat;
                if(repeat==1)
                    continue;
                else if(repeat==2)
                    break;
            }
            string amount;
            stringstream ss;
            ss << a;
            ss >> amount;
            arr3[i]=amount;
            cout<<endl;
            cout<<"Enter the Phone Number : ";
            cin>>arr4[i];
            cout<<"Enter the Date :  ";
            cin>>arr5[i];
            //part of home dlvry distanse.....................
            int dselect,sv,pv,kv=0,damount,ds; //sv=source vertix ,pv = place vertix
            cout<<"This was homee delivary ?    "<<endl<<endl<<"1 Yes "<<endl<<" 2 No"<< endl<<" Please enter : ";
            cin>>dselect;
            if(dselect==1)
            {
                int graph[10][10]=
                {
                    {0, 2, 10, 0, 0, 0, 0, 0, 0, 0},
                    {2, 0, 0, 0, 10, 0, 0, 0, 0, 0},
                    {10, 0, 0, 12, 0, 0, 30, 0, 0, 0},
                    {0, 0, 12, 0, 0, 0, 0, 14, 0, 15},
                    {0, 10, 0, 0, 0, 15, 0, 0, 0, 35},
                    {0, 0, 0, 0, 15, 0, 10, 0, 0, 0},
                    {0, 0, 30, 0, 0, 10, 0, 10, 0, 0},
                    {0, 0, 0, 14, 0, 0, 10, 0, 10, 0},
                    {0, 0, 0, 0, 0, 0, 0, 10, 0, 15},
                    {0, 0, 0, 15, 35, 0, 0, 0, 15, 0}
                };
                int sc;
                cout<<endl;
                cout<<"Select the Restuarent brance : "<<endl;
                cout<<"1 Dhanmondi Brance"<<endl<<"2 Mogbajar Brance "<<endl<<" 3 Khilgaon Brance "<<endl;
                cout<<endl;
                cin>>ds;
                if(ds==1)
                    sc=0;
                if(ds==2)
                    sc=5;
                if(ds==3)
                    sc=8;
                Dijkstra(graph,sc);
                cout<<" The Minimum cost of delivary : "<<distanceMin<<endl;
                cout<<endl;
                string dplc;
                stringstream ss2;
                ss2 << distanceMin;
                ss2 >> dplc;
                arr6[i]=dplc;
                cout<<endl;
            }
            else
                arr6[i]="0";
            cin.ignore();
        }
        total=ch+total;
    }
}
void show()
{
    if(total==0)
        cout<<"No data is entered"<<endl;
    else
    {
        for(int i=0; i<total; i++)
        {
            cout<<"\nData of Customer No  "<<i+1<<endl<<endl;
            cout<<"Name :\t"<<arr1[i]<<endl;
            cout<<"User Name  :\t"<<arr2[i]<<endl;
            cout<<"Total Amount of :\t"<<arr3[i]<<endl;
            cout<<"Contact :\t"<<arr4[i]<<endl;
            cout<<"Date :\t"<<arr5[i]<<endl;
            cout<<"Minimum cost of delivary  :\t"<<arr6[i]<<endl;
        }
    }
}
void Search()
{
    if(total==0)
        cout<<"No data is entered"<<endl;
    else
    {
        string userName;
        cout<<"Enter the User name or code of customer : "<<endl;
        cin>>userName;
        for(int i=0; i<total; i++)
        {
            if(userName==arr2[i])
            {
                cout<<"Name :\t"<<arr1[i]<<endl;
                cout<<"User Name  :\t"<<arr2[i]<<endl;
                cout<<"Total Amount of :\t"<<arr3[i]<<endl;
                cout<<"Contact :\t"<<arr4[i]<<endl;
                cout<<"Date :\t"<<arr5[i]<<endl;
                cout<<"Minimum cost of delivary  :\t"<<arr6[i]<<endl;
            }
        }
    }
}
void update()
{
    if(total==0)
        cout<<"No data is entered"<<endl;
    else
    {
        string userName;
        cout<<"Enter the User Name of customer whose data you want to update : "<<endl;
        cin>>userName;
        for(int i=0; i<total; i++)
        {
            if(userName==arr2[i])
            {
                cout<<"\nPrevious data"<<endl<<endl;
                cout<<"Data of Customer No "<<i+1<<endl;
                cout<<"Name :\t"<<arr1[i]<<endl;
                cout<<"User Name  :\t"<<arr2[i]<<endl;
                cout<<"Total Amount of :\t"<<arr3[i]<<endl;
                cout<<"Contact :\t"<<arr4[i]<<endl;
                cout<<"Date :\t"<<arr5[i]<<endl;
                cout<<"\nEnter new data"<<endl<<endl;
                cout<<"Enter the name of customer  ";
                cin.ignore();
                getline(cin,arr1[i]);
                cout<<endl;
                cout<<"Enter the code or username of customer :  ";
                cin>>arr2[i];
                cout<<endl;
                cout<<"Enter the bill of cutomer\n";
                cout<<endl;
                cout<<endl;
                //...........................
                cout<<"\t\t [0] Beef Biryani - BDT 120.00\n";
                cout<<"\t\t [1] Special Meal - BDT 160.00\n";
                cout<<"\t\t [2] Chiken Biryani - BDT 130.00\n";
                cout<<"\t\t [3] Beef Khichuri - BDT 80.00\n";
                cout<<"\t\t [4] Pasta - BDT 60.00\n";
                cout<<"\t\t [5] Sub Senduis - BDT 70.00\n";
                cout<<"\t\t [6] Hot Dog - BDT 50.00\n";
                cout<<"\t\t [7] Burger - BDT 80.00\n";
                cout<<"\t\t [8] Coke - BDT 20.00\n";
                cout<<"\t\t [9] Coffee - BDT 15.00\n";
                cout<<endl;
                cout<<endl;
                int n=9;
                for(int i=0; i<=n; i++)
                {
                    cout<<"Please select what did you sell ?  : ";
                    int select,quantity;
                    cin>>select;
                    switch (select)
                    {
                    case 0:
                        select=120;
                        break;
                    case 1:
                        select=160;
                        break;
                    case 2:
                        select=130;
                        break;
                    case 3:
                        select=80;
                        break;
                    case 4:
                        select=60;
                        break;
                    case 5:
                        select=70;
                        break;
                    case 6:
                        select=50;
                        break;
                    case 7:
                        select=80;
                        break;
                    case 8:
                        select=20;
                        break;
                    case 9:
                        select=15;
                        break;
                    default:
                        exit(0);
                        break;

                    }
                    cout<<"Enter The Quantity   :";
                    cin>>quantity;
                    cout<<endl;
                    int multi=select*quantity;
                    a=a+multi;
                    cout<<"Did you sell anything else ? : ";
                    cout<<"\t 1.YES\n2.No \n";
                    cout<<endl;
                    cout<<"Chose Your Option : ";
                    int repeat;
                    cin>>repeat;
                    if(repeat==1)
                        continue;
                    else if(repeat==2)
                        break;
                }
                string amount;
                stringstream ss;
                ss << a;
                ss >> amount;
                arr3[i]=amount;
                cout<<endl;
                cout<<"Enter the Phone Number : ";
                cin>>arr4[i];
                cout<<"Enter the Date  : ";
                cin>>arr5[i];
                //part of home dlvry distanse.....................
                int dselect,sv,pv,kv=0,damount,ds; //sv=source vertix ,pv = place vertix
                cout<<"This was homee delivary ?    "<<endl<<"1 Yes "<<endl<<" 2 No"<< endl<<" Please enter : ";
                cin>>dselect;
                if(dselect==1)
                {
                    int graph[10][10]=
                    {
                        {0, 2, 10, 0, 0, 0, 0, 0, 0, 0},
                        {2, 0, 0, 0, 10, 0, 0, 0, 0, 0},
                        {10, 0, 0, 12, 0, 0, 30, 0, 0, 0},
                        {0, 0, 12, 0, 0, 0, 0, 14, 0, 15},
                        {0, 10, 0, 0, 0, 15, 0, 0, 0, 35},
                        {0, 0, 0, 0, 15, 0, 10, 0, 0, 0},
                        {0, 0, 30, 0, 0, 10, 0, 10, 0, 0},
                        {0, 0, 0, 14, 0, 0, 10, 0, 10, 0},
                        {0, 0, 0, 0, 0, 0, 0, 10, 0, 15},
                        {0, 0, 0, 15, 35, 0, 0, 0, 15, 0}
                    };
                    int sc;
                    cout<<"Select the restuarent brance : "<<endl;
                    cout<<"1 Dhanmondi Brance"<<endl<<"2 Mogbajar Brance "<<endl<<" 3 Khilgaon Brance "<<endl;
                    cin>>ds;
                    if(ds==1)
                        sc=0;
                    if(ds==2)
                        sc=5;
                    if(ds==3)
                        sc=8;
                    Dijkstra(graph,sc);
                    cout<<" The Minimum cost of delivary : "<<distanceMin<<endl;
                    string dplc;
                    stringstream ss2;
                    ss2 << distanceMin;
                    ss2 >> dplc;
                    arr6[i]=dplc;
                    cout<<endl;
                }
                else
                    arr6[i]="0";
                cin.ignore();
                a=0;
            }
        }
    }
}
void deleterecord()
{
    if(total==0)
        cout<<"No data is entered"<<endl;
    else
    {
        int d;
        cout<<"Press 1 to delete all record"<<endl;
        cout<<"Press 2 to delete specific record"<<endl;
        cin>>d;
        if(d==1)
        {
            total=0;
            cout<<"All record is deleted..!!"<<endl;
        }
        else if(d==2)
        {
            string userName;
            cout<<"Enter the user Name of customer whose data you wanted to delete"<<endl;
            cin>>userName;
            for(int i=0; i<total; i++)
            {
                if(userName==arr2[i])
                {
                    for(int j=i; j<total; j++)
                    {
                        arr1[j]=arr1[j+1];
                        arr2[j]=arr2[j+1];
                        arr3[j]=arr3[j+1];
                        arr4[j]=arr4[j+1];
                        arr5[j]=arr5[j+1];
                    }
                    total--;
                    cout<<"Your required record is deleted"<<endl;
                }
            }
        }
        else
            cout<<"Invalid input";

    }
}
void Display()
{
    cout<<"\n                Welcome to GUB Restaurant.          \n ";
    cout<<"              =============================          \n\n";
    cout<<"                      City Branch\n              220/D Begum Rokeya Sarani, Dhaka\n\n";
    time_t tm;
    time(&tm);
    cout<<"\t      \t "<<ctime(&tm)<<endl;
}
main()
{
    int value;
    Display();
    while(true)
    {
        cout<<"\n______Press 1 to Enter Your Customer data"<<endl;
        cout<<"______Press 2 to Show Your Customer data"<<endl;
        cout<<"______Press 3 to Search Your Customer data"<<endl;
        cout<<"______Press 4 to Update Your Customer data"<<endl;
        cout<<"______Press 5 to Delete Your Customer data"<<endl;
        cout<<"______Press 6 to Exit"<<endl;
        cin>>value;
        switch(value)
        {
        case 1:
            enter();
            break;
        case 2:
            show();
            break;
        case 3:
            Search();
            break;
        case 4:
            update();
            break;
        case 5:
            deleterecord();
            break;
        case 6:
            exit(0);
            break;
        default:
            cout<<"Invalid input"<<endl;
            break;
        }
    }
}
