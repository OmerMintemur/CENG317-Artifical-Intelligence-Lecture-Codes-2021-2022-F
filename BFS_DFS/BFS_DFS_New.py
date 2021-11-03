graph = {
    1: [2, 3],
    2: [4, 5],
    3: [5],
    4: [6],
    5: [6],
    6: [7],
    7: []
}



visited = [] #This list will keep the visited nodes
queue = [] #We need a queue for the unvisited nodes (for the BFS)
stack = [] #We need a queue for the unvisited nodes (for the DFS)
def bfs(visited, graph,node):
    visited.append(node) #This node has been visited
    queue.append(node) #This node has been queued.

    while queue: #Until all queue has been emptied.
        m = queue.pop(0)
        print(m)
        for neighbour in graph[m]:
           if neighbour not in visited:
               visited.append(neighbour)
               queue.append(neighbour)

def dfs(visited,graph, node):
    visited.append(node) #This node has been visited
    stack.append(node) #This node has been queued.
    while stack:#Until all stack has been emptied.
        m = stack.pop()
        print(m)
        for neighbour in graph[m]:
            if neighbour not in visited:
                visited.append(neighbour)
                stack.append(neighbour)

bfs(visited, graph, 1)
print("--------------------------------")
visited = []
dfs(visited, graph, 1)
