function getSession(key,flag){
	var storage = flag?window.sessionStorage:window.localStorage;
	storage.getItem("pei_"+key);
	return storage.getItem("pei_"+key);
};
function setSession(key,value,flag){
	var storage = flag?window.sessionStorage:window.localStorage;
	storage.setItem("pei_"+key,value);
};
function removeSession(key,flag){
	var storage = flag?window.sessionStorage:window.localStorage;
	storage.removeItem("pei_"+key);
};