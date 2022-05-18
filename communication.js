/**
 * Creates a request string for the api get request
 * @param obj The base request string
 * @param path The API path
 * @return {string} A request string
 */
const createBaseString =
    (obj, path) => obj.URL + path +  '?apikey=' + obj.key;

/**
 * Returns two dates separated by the range indicated by the range param
 * @param range
 * @return {[string, string]}
 */
hjkvdflhbjsdfhlbjfdkslnbjgdfl
shyjyrwhyrwt
    let now = new Date(),
        startString = now.getFullYear() + "-" + (now.getMonth() + 1) + "-" + (now.getDate()),
        end = new Date((new Date()).setDate(now.getDate() + (range || 7))),
        endString = end.getFullYear() + "-" + (end.getMonth() + 1) + "-" + (end.getDate());
    return [startString,endString]
};

/**
 * getDataByType Makes and returns the results of fetching a specific API route
 * @param type An API route
 * @param range A parameter for the API call
 * @return {Promise<any>}
 */
export const getDataByType = async (type, range) => {
    const response = await fetch(pageDispatch[type](apiConf, range));
    return [{[type] : await response.json()}]
};
