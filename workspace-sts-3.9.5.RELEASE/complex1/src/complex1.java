
 class complex {
	float real;
	float imag;
	complex()
	{}
	
		 complex(float real,float imag)
		{
			
		this.real=real;
		this.imag=imag;
		
		}
		complex AddComplex(complex c1,complex c2)
		{
			complex csum=new complex();
			csum.real=c1.real+c2.real;
			csum.imag=c1.imag+c2.imag;
			return csum;

}

}

