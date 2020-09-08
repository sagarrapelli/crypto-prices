function getCrypto(val) {
  	localStorage.setItem("curr",val);
  	console.log(localStorage.getItem("curr"));
  	window.location.href = "price.html";
}

function generateDynamicTable(prices){
	
		var noOfRows = prices.length;
		
		if(noOfRows>0){
			
 
			// CREATE DYNAMIC TABLE.
			var table = document.createElement("table");
			table.style.width = '50%';
			table.setAttribute('border', '1');
			table.setAttribute('cellspacing', '0');
			table.setAttribute('cellpadding', '5');
			
			// retrieve column header ('Name', 'Email', and 'Mobile')
 
			var col = []; // define an empty array
			for (var i = 0; i < noOfRows; i++) {
				for (var key in prices[i]) {
					if (col.indexOf(key) === -1) {
						col.push(key);
					}
				}
			}
			
			// CREATE TABLE HEAD .
			var tHead = document.createElement("thead");	
				
			
			// CREATE ROW FOR TABLE HEAD .
			var hRow = document.createElement("tr");
			
			// ADD COLUMN HEADER TO ROW OF TABLE HEAD.
			for (var i = 0; i < col.length; i++) {
					var th = document.createElement("th");
					th.innerHTML = col[i];
					hRow.appendChild(th);
			}
			tHead.appendChild(hRow);
			table.appendChild(tHead);
			
			// CREATE TABLE BODY .
			var tBody = document.createElement("tbody");	
			
			// ADD COLUMN HEADER TO ROW OF TABLE HEAD.
			for (var i = 0; i < noOfRows; i++) {
			
					var bRow = document.createElement("tr"); // CREATE ROW FOR EACH RECORD .
					
					
					for (var j = 0; j < col.length; j++) {
						var td = document.createElement("td");
						td.innerHTML = prices[i][col[j]];
						bRow.appendChild(td);
					}
					tBody.appendChild(bRow)
 
			}
			table.appendChild(tBody);	
			
			
			// FINALLY ADD THE NEWLY CREATED TABLE WITH JSON DATA TO A CONTAINER.
			var divContainer = document.getElementById("body");
			divContainer.innerHTML = "";
			divContainer.appendChild(table);
			
		}	
	}