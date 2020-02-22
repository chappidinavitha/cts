const express=require('express');
const app=express();
const port=5000;
app.get('/student',function(req,res){
    res.send('student:get all students')
})
app.post('/student/:id',function(req,res){
    let id=req.params.id;
    res.send("studentid:"+id);
})
app.put('/student',function(req,res){
    res.send('student:put')
})
app.delete('/student',function(req,res){
    res.send('student:delete')
})
app.listen(port,function(){
console.log('server is running at port:'+port)
})

