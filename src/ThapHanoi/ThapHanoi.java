/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThapHanoi;
/**
 *
 * @author admin
 */
public class ThapHanoi {
	public static int pow(int x,int y) {
		for (int i = 1;i<y;i++) {
			x=x*2;
		}
		return x;
	}
	public static void main (String [] args) {
                //number of disk: 
		int n = Integer.parseInt(args [0]);
                
		double [] x1 = new double [n+1];
		double [] y1 = new double [n+1];
		double [] x2 = new double [n+1];
		double [] y2 = new double [n+1];
		x1[n] = 1.0;
		y1[n] = 0.2;
		x2[n] = 5.0;
		y2[n] = 0.2;
		for (int i = n-1;i>0;i--) {
			x1[i] = x1[i+1] + 0.1;
			y1[i] = y1[i+1] + 0.4;
			x2[i] = x2[i+1] - 0.1;
			y2[i] = y2[i+1] + 0.4;
		}
		StdDraw.setXscale(0.0,16.0);
		StdDraw.setYscale(0.0,16.0);
		StdDraw.setPenRadius(0.02);
		StdDraw.line(3.0,0.0,3.0,10.0);
		StdDraw.line(8.0,0.0,8.0,10.0);
		StdDraw.line(13.0,0.0,13.0,10.0);
		for (int i = 1;i<n+1;i++) {
			 StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.line (x1[i],y1[i],x2[i],y2[i]);
		}
		int [] disk = new int[pow(2,n)];
		for (int i=1;i<=n;i++) {
			for (int j = pow(2,i)/2;j<=(pow(2,n)-1);j=j+pow(2,i)) {
				disk[j]=i;
			}
		}
		if (n%2!=0) {
			for (int i = 1;i<pow(2,n);i++) {
				for (int j = 1;j<pow(2,n);j++) {
				if (disk[i]%2!=0) {
					if (x2[disk[i]]<6.0) {
					StdDraw.setPenRadius(0.03);
					StdDraw.setPenColor(StdDraw.WHITE);
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
	    	        StdDraw.setPenRadius(0.02);
	    	        StdDraw.setPenColor(StdDraw.BLACK);
	    	        x1[disk[i]] = x1[disk[i]] + 10.0;
	    	        x2[disk[i]] = x2[disk[i]] + 10.0;
	    	        StdDraw.line(3.0,y1[disk[i]]+0.2,3.0,y1[disk[i]]-0.2);
		            StdDraw.line(8.0,y1[disk[i]]+0.2,8.0,y1[disk[i]]-0.2);
		            StdDraw.line(13.0,y1[disk[i]]+0.2,13.0,y1[disk[i]]-0.1);
		            StdDraw.setPenColor(StdDraw.BLUE);
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
	    	        StdDraw.show(1000);
	    	        break;
					}
					if (x1[disk[i]]>10.0) {
					StdDraw.setPenRadius(0.03);
					StdDraw.setPenColor(StdDraw.WHITE);
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
	    	        StdDraw.setPenRadius(0.02);
	    	        StdDraw.setPenColor(StdDraw.BLACK);
	    	           StdDraw.line(3.0,y1[disk[i]]+0.2,3.0,y1[disk[i]]-0.2);
		            StdDraw.line(8.0,y1[disk[i]]+0.2,8.0,y1[disk[i]]-0.2);
		            StdDraw.line(13.0,y1[disk[i]]+0.2,13.0,y1[disk[i]]-0.15);
		            StdDraw.setPenColor(StdDraw.BLUE);
	    	        x1[disk[i]] = x1[disk[i]] - 5.0;
	    	        x2[disk[i]] = x2[disk[i]] - 5.0;
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
                    StdDraw.show(1000);
	    	        break;
					}
					if ((x1[disk[i]]>=6.0)&&(x2[disk[i]]<=10.0)) {
						StdDraw.setPenRadius(0.03);
					StdDraw.setPenColor(StdDraw.WHITE);
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
	    	        StdDraw.setPenRadius(0.02);
	    	        StdDraw.setPenColor(StdDraw.BLACK);
	    	          StdDraw.line(3.0,y1[disk[i]]+0.2,3.0,y1[disk[i]]-0.2);
		            StdDraw.line(8.0,y1[disk[i]]+0.2,8.0,y1[disk[i]]-0.2);
		            StdDraw.line(13.0,y1[disk[i]]+0.2,13.0,y1[disk[i]]-0.15);
		            StdDraw.setPenColor(StdDraw.BLUE);
	    	        x1[disk[i]] = x1[disk[i]] - 5.0;
	    	        x2[disk[i]] = x2[disk[i]] - 5.0;
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
	    	        StdDraw.show(1000);
	    	        break;
	    	         
					}
					
               
				}
				if (disk[i]%2==0) {
					if (x2[disk[i]]<6.0) {
						StdDraw.setPenRadius(0.03);
					StdDraw.setPenColor(StdDraw.WHITE);
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
	    	        StdDraw.setPenRadius(0.02);
	    	        StdDraw.setPenColor(StdDraw.BLACK);
	    	        x1[disk[i]] = x1[disk[i]] + 5.0;
	    	        x2[disk[i]] = x2[disk[i]] + 5.0;
	    	       StdDraw.line(3.0,y1[disk[i]]+0.2,3.0,y1[disk[i]]-0.2);
		            StdDraw.line(8.0,y1[disk[i]]+0.2,8.0,y1[disk[i]]-0.2);
		            StdDraw.line(13.0,y1[disk[i]]+0.2,13.0,y1[disk[i]]-0.15);
		            StdDraw.setPenColor(StdDraw.BLUE);
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
	    	        StdDraw.show(1000);
	    	        break;
					}
					if (x1[disk[i]]>10.0) {
						StdDraw.setPenRadius(0.03);
					StdDraw.setPenColor(StdDraw.WHITE);
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
	    	        StdDraw.setPenRadius(0.02);
	    	        StdDraw.setPenColor(StdDraw.BLACK);
	    	         StdDraw.line(3.0,y1[disk[i]]+0.2,3.0,y1[disk[i]]-0.2);
		            StdDraw.line(8.0,y1[disk[i]]+0.2,8.0,y1[disk[i]]-0.2);
		            StdDraw.line(13.0,y1[disk[i]]+0.2,13.0,y1[disk[i]]-0.15);
		            StdDraw.setPenColor(StdDraw.BLUE);
	    	        x1[disk[i]] = x1[disk[i]] - 10.0;
	    	        x2[disk[i]] = x2[disk[i]] - 10.0;
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
                    StdDraw.show(1000);
	    	        break;
					}
					if ((x1[disk[i]]>=6.0)&&(x2[disk[i]]<=10.0)) {
						StdDraw.setPenRadius(0.03);
					StdDraw.setPenColor(StdDraw.WHITE);
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
	    	        StdDraw.setPenRadius(0.02);
	    	        StdDraw.setPenColor(StdDraw.BLACK);
	    	           StdDraw.line(3.0,y1[disk[i]]+0.2,3.0,y1[disk[i]]-0.2);
		            StdDraw.line(8.0,y1[disk[i]]+0.2,8.0,y1[disk[i]]-0.2);
		            StdDraw.line(13.0,y1[disk[i]]+0.2,13.0,y1[disk[i]]-0.15);
		            StdDraw.setPenColor(StdDraw.BLUE);
	    	        x1[disk[i]] = x1[disk[i]] + 5.0;
	    	        x2[disk[i]] = x2[disk[i]] + 5.0;
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
	    	        StdDraw.show(1000);
	    	        break;
	    	         
					}
				}

			}
			}
		}
		if (n%2==0) {
			for (int i = 1;i<pow(2,n);i++) {
				for (int j = 1;j<pow(2,n);j++) {
				if (disk[i]%2!=0) {
					if (x2[disk[i]]<6.0) {
						StdDraw.setPenRadius(0.03);
					StdDraw.setPenColor(StdDraw.WHITE);
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
	    	        StdDraw.setPenRadius(0.02);
	    	        StdDraw.setPenColor(StdDraw.BLACK);
	    	        x1[disk[i]] = x1[disk[i]] + 5.0;
	    	        x2[disk[i]] = x2[disk[i]] + 5.0;
	    	           StdDraw.line(3.0,y1[disk[i]]+0.2,3.0,y1[disk[i]]-0.2);
		            StdDraw.line(8.0,y1[disk[i]]+0.2,8.0,y1[disk[i]]-0.2);
		            StdDraw.line(13.0,y1[disk[i]]+0.2,13.0,y1[disk[i]]-0.15);
		            StdDraw.setPenColor(StdDraw.BLUE);
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
	    	        StdDraw.show(1000);
	    	        break;
					}
					if (x1[disk[i]]>10.0) {
						StdDraw.setPenRadius(0.03);
					StdDraw.setPenColor(StdDraw.WHITE);
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
	    	        StdDraw.setPenRadius(0.02);
	    	        StdDraw.setPenColor(StdDraw.BLACK);
	    	          StdDraw.line(3.0,y1[disk[i]]+0.2,3.0,y1[disk[i]]-0.2);
		            StdDraw.line(8.0,y1[disk[i]]+0.2,8.0,y1[disk[i]]-0.2);
		            StdDraw.line(13.0,y1[disk[i]]+0.2,13.0,y1[disk[i]]-0.15);
		            StdDraw.setPenColor(StdDraw.BLUE);
	    	        x1[disk[i]] = x1[disk[i]] - 10.0;
	    	        x2[disk[i]] = x2[disk[i]] - 10.0;
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
                    StdDraw.show(1000);
	    	        break;
					}
					if ((x1[disk[i]]>=6.0)&&(x2[disk[i]]<=10.0)) {
						StdDraw.setPenRadius(0.03);
					StdDraw.setPenColor(StdDraw.WHITE);
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
	    	        StdDraw.setPenRadius(0.02);
	    	        StdDraw.setPenColor(StdDraw.BLACK);
	    	        StdDraw.line(3.0,y1[disk[i]]+0.2,3.0,y1[disk[i]]-0.2);
		            StdDraw.line(8.0,y1[disk[i]]+0.2,8.0,y1[disk[i]]-0.2);
		            StdDraw.line(13.0,y1[disk[i]]+0.2,13.0,y1[disk[i]]-0.15);
		            StdDraw.setPenColor(StdDraw.BLUE);
	    	        x1[disk[i]] = x1[disk[i]] + 5.0;
	    	        x2[disk[i]] = x2[disk[i]] + 5.0;
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
	    	        StdDraw.show(1000);
	    	        break;
	    	         
					}
					
               
				}
				if (disk[i]%2==0) {
					if (x2[disk[i]]<6.0) {
						StdDraw.setPenRadius(0.03);
					StdDraw.setPenColor(StdDraw.WHITE);
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
	    	        StdDraw.setPenRadius(0.02);
	    	        StdDraw.setPenColor(StdDraw.BLACK);
	    	        x1[disk[i]] = x1[disk[i]] + 10.0;
	    	        x2[disk[i]] = x2[disk[i]] + 10.0;
	    	          StdDraw.line(3.0,y1[disk[i]]+0.2,3.0,y1[disk[i]]-0.2);
		            StdDraw.line(8.0,y1[disk[i]]+0.2,8.0,y1[disk[i]]-0.2);
		            StdDraw.line(13.0,y1[disk[i]]+0.2,13.0,y1[disk[i]]-0.15);
		            StdDraw.setPenColor(StdDraw.BLUE);
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
	    	        StdDraw.show(1000);
	    	        break;
					}
					if (x1[disk[i]]>10.0) {
						StdDraw.setPenRadius(0.03);
					StdDraw.setPenColor(StdDraw.WHITE);
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
	    	        StdDraw.setPenRadius(0.02);
	    	        StdDraw.setPenColor(StdDraw.BLACK);
	    	         StdDraw.line(3.0,y1[disk[i]]+0.2,3.0,y1[disk[i]]-0.2);
		            StdDraw.line(8.0,y1[disk[i]]+0.2,8.0,y1[disk[i]]-0.2);
		            StdDraw.line(13.0,y1[disk[i]]+0.2,13.0,y1[disk[i]]-0.15);
		            StdDraw.setPenColor(StdDraw.BLUE);
	    	        x1[disk[i]] = x1[disk[i]] - 5.0;
	    	        x2[disk[i]] = x2[disk[i]] - 5.0;
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
                    StdDraw.show(1000);
	    	        break;
					}
					if ((x1[disk[i]]>=6.0)&&(x2[disk[i]]<=10.0)) {
						StdDraw.setPenRadius(0.03);
					StdDraw.setPenColor(StdDraw.WHITE);
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
	    	        StdDraw.setPenRadius(0.02);
	    	        StdDraw.setPenColor(StdDraw.BLACK);
	    	       StdDraw.line(3.0,y1[disk[i]]+0.2,3.0,y1[disk[i]]-0.2);
		            StdDraw.line(8.0,y1[disk[i]]+0.2,8.0,y1[disk[i]]-0.2);
		            StdDraw.line(13.0,y1[disk[i]]+0.2,13.0,y1[disk[i]]-0.15);
		            StdDraw.setPenColor(StdDraw.BLUE);
	    	        x1[disk[i]] = x1[disk[i]] - 5.0;
	    	        x2[disk[i]] = x2[disk[i]] - 5.0;
	    	        StdDraw.line(x1[disk[i]],y1[disk[i]],x2[disk[i]],y2[disk[i]]);
	    	        StdDraw.show(1000);
	    	        break;
	    	         
					}
				}

			}
			}
		}

		}

	}


