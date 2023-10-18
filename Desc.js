function desc(array)
{
    array.sort((a,b)=>b-a);
    console.log(array);
}
const array=[22,33,44,55,66];
desc(array);