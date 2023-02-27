class Movies {

    public static void main(String[] args) {
        
        
        String[] filmTitles = {"Indiana Jones and the Temple of Doom", "Indiana Jones and the Last Crusade", "Indiana Jones and the Kingdom of the Crystal Skull"};
        
        String[][] actors = new String[][] {
    	{"Harrison Ford", "Kate Capshaw", "Ke Huy Quan"},
    	{"Harrison Ford", "Sean Connery","Denholm Elliott"},
    	{"Harrison Ford", "Shia LaBeouf", "Karen Allen"}
	};
	
	for (int i = 0; i < filmTitles.length; i++) {
	
   		 System.out.println("Dans le film : "+filmTitles[i]+", les principaux acteurs sont : "+actors[i][0]+", " + actors[i][1]+", " + actors[i][2]);
   		
	}
       
    }
}
